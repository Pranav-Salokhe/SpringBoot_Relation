package com.admin.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.admin.dto.CustomerDTO;
import com.admin.model.Customers;
import com.admin.service.CustomerService;

@RestController
@RequestMapping("/customer")
public class CustomerController {

	@Autowired
	private CustomerService customerService;
	
	@PostMapping("/")
	public ResponseEntity<Customers> saveAllCustomer(@RequestBody CustomerDTO customerDTO){
		
		Customers cust = new Customers();
		cust.setFirstName(customerDTO.getFirstName());
		cust.setLastName(customerDTO.getLastName());
		cust.setAddress(customerDTO.getAddress());
		cust.setProducts(customerDTO.getProducts());
		
		Customers insertedCustomer = customerService.saveCustomer(cust);
		return new ResponseEntity<>(insertedCustomer,HttpStatus.OK);
		
	}
}
