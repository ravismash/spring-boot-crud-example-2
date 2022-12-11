package com.javatechie.crud.eample.service;


import com.javatechie.crud.eample.entity.Product;
import com.javatechie.crud.eample.repository.ProductRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class ProductService {
	@Autowired
	private ProductRepository repository;
	public Product saveProduct(Product product) {
		return repository.save(product);
	}
	public List<Product> saveProducts(List<Product> products) {
		return repository.saveAll(products);
	}
	
	
	public List<Product> getProducts() {
		return repository.findAll();
	}
	public Product getProductById(int id) {
		return repository.findById(id).orElse(null);
	}
	public Product getProductByName(String Name) {
		return repository.findByName(Name);
	}
	public String deleteProduct(int id) {
		repository.deleteById(id);
		return "product removed||" + id;
	}
	
	public Product updateProduct(Product product) {
		Product existingproduct = repository.findById(product.getId()).orElse(null);
		existingproduct.setId(product.getId());
		existingproduct.setName(product.getName());
		existingproduct.setPrice(product.getPrice());
		existingproduct.setQuantity(product.getQuantity());
		return repository.save(existingproduct);
	}
	
	
	
	

}
