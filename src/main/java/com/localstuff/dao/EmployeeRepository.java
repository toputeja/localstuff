package com.localstuff.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import com.localstuff.client.entity.EmployeeRegisterEntity;


public interface EmployeeRepository extends JpaRepository<EmployeeRegisterEntity, Integer> {

}
