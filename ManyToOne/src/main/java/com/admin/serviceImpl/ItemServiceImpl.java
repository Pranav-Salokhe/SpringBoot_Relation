package com.admin.serviceImpl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.admin.model.Items;
import com.admin.repository.ItemRepository;
import com.admin.service.ItemService;

@Service
public class ItemServiceImpl implements ItemService {

	@Autowired
	private ItemRepository itemRepository;
	
	@Override
	public List<Items> getAllItems() {
		
		return itemRepository.findAll();
	}

	@Override
	public Items saveAll(Items items) {
		
		return itemRepository.save(items);
	}

}
