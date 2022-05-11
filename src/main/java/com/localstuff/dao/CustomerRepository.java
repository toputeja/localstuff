package com.localstuff.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import com.localstuff.client.entity.CustomerRegisterEntity;


public interface CustomerRepository extends JpaRepository<CustomerRegisterEntity, Integer> {

}
