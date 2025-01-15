package com.admin.dto;

import java.util.List;

import com.admin.model.Products;

import lombok.Data;

@Data
public class CustomerDTO {

	
	private String firstName;
	private String lastName;
	private String address;
	
	private List<Products> products;
}
