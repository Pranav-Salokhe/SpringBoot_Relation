package com.admin.service;

import java.util.List;

import com.admin.model.Items;

public interface ItemService {

	List<Items> getAllItems();
	Items saveAll(Items items);
}
