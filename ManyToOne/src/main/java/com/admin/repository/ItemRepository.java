package com.admin.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.admin.model.Items;

@Repository
public interface ItemRepository extends JpaRepository<Items, Integer> {

}
