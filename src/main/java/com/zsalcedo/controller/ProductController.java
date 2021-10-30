package com.zsalcedo.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.zsalcedo.model.Product;
import com.zsalcedo.service.impl.ProductServiceImpl;

@RestController
public class ProductController {
	@Autowired
	private ProductServiceImpl productServiceImpl;

	@GetMapping("/listProducts")
	public List<Product> findAll() {
		return productServiceImpl.findAll();

	}

	@GetMapping("/getProduct/{id}")
	public Product findById(@PathVariable("id") String id) {
		return productServiceImpl.findById(id);
	}

	@PostMapping("/addProduct")
	public Product save(@RequestBody Product product) {
		return productServiceImpl.save(product);
	}

	@PutMapping("/updateProduct/{id}")
	public Product update(@RequestBody Product product) {
		return productServiceImpl.save(product);
	}

	@DeleteMapping("/deleteProduct/{id}")
	public void delete(@PathVariable String id) {
		productServiceImpl.delete(id);
	}

}
