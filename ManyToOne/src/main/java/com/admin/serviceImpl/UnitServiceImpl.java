package com.admin.serviceImpl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.admin.model.Units;
import com.admin.repository.UnitRepository;
import com.admin.service.UnitService;

@Service
public class UnitServiceImpl implements UnitService {

	@Autowired
	private UnitRepository unitRepository;
	
	@Override
	public Units getById(int id) {
		
		return unitRepository.findById(id).orElse(null);
	}

}
