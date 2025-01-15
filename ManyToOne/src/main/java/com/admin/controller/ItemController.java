package com.admin.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.admin.dto.ItemDTO;
import com.admin.model.Items;
import com.admin.model.Units;
import com.admin.service.ItemService;
import com.admin.service.UnitService;

@RestController
@RequestMapping("/items")
public class ItemController {

	@Autowired
	private UnitService unitService;
	
	@Autowired
	private ItemService itemService;
	
	
	
	@PostMapping("/")
	public ResponseEntity<Items> saveAllData(@RequestBody ItemDTO itemDTO){
		Items items = new Items();
		items.setName(itemDTO.getName());
		items.setRate(itemDTO.getRate());
		
		Units units = unitService.getById(itemDTO.getUnitsid());
		items.setUnits(units);
		
		Items updatedItems = itemService.saveAll(items);
		
		return new ResponseEntity<>(updatedItems,HttpStatus.CREATED);
	}
	
	
	@GetMapping("/")
	public ResponseEntity<List<Items>> findAllData(){
		
		List<Items> items = itemService.getAllItems();
		return new ResponseEntity<>(items,HttpStatus.OK);
	}
}
