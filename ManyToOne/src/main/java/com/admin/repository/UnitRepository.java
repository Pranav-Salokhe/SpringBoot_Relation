package com.admin.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.admin.model.Units;

@Repository
public interface UnitRepository extends JpaRepository<Units, Integer> {

}
