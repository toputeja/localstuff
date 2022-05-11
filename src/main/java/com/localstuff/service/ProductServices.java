package com.localstuff.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.localstuff.client.entity.ProductEntity;
import com.localstuff.dao.ProductRepository;

@Service
public class ProductServices {

	@Autowired
	private ProductRepository productRepository;

	public void saveProduct(ProductEntity productEntity) {
		this.productRepository.save(productEntity);
	}

	public void updateProduct(ProductEntity productEntity) {
		this.productRepository.saveAndFlush(productEntity);
	}

	public void getproduct(int id) {
		this.productRepository.getById(id);
	}

	public void deleteProduct(int id) {
		this.productRepository.deleteById(id);
	}

	public void getAllProduct(ProductEntity productEntity) {
		this.productRepository.save(productEntity);
	}

	public void getByProductName(String productName) {
		this.productRepository.getByProductName(productName);
	}

	

}
