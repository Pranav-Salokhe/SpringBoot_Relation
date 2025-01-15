package com.admin.serviceImpl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.admin.model.Customers;
import com.admin.repository.CustomerRepository;
import com.admin.service.CustomerService;

@Service
public class CustomerServiceImpl implements CustomerService {

	@Autowired
	private CustomerRepository customerRepository;
	
	@Override
	public Customers saveCustomer(Customers customers) {
		
		return customerRepository.save(customers) ;
	}

}
