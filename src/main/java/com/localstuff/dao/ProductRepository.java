package com.localstuff.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import com.localstuff.client.entity.ProductEntity;


public interface ProductRepository extends JpaRepository<ProductEntity, Integer> {

	public ProductEntity getByProductName(String name);
}
