package com.zsalcedo.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.zsalcedo.model.Product;
import com.zsalcedo.repository.IProductRepository;
import com.zsalcedo.service.IProductService;
@Service
public class ProductServiceImpl implements IProductService {

	@Autowired
	private IProductRepository productRepository;
	
	
	@Override
	@Transactional(readOnly = true)
	public List<Product> findAll() {
		return productRepository.findAll();
	}

	@Override
	@Transactional(readOnly = true)
	public Product findById(String id) {
		return productRepository.findById(id).orElse(null);
	}

	@Override
	@Transactional(readOnly = true)
	public Product save(Product product) {
		return productRepository.save(product);
	}

	@Override
	@Transactional(readOnly = true)
	public void delete(String id) {
		productRepository.deleteById(id);
		
	}

	
}
