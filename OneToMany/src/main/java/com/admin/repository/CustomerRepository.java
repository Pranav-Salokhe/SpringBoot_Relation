package com.admin.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.admin.model.Customers;

@Repository
public interface CustomerRepository extends JpaRepository<Customers, Integer> {

}
