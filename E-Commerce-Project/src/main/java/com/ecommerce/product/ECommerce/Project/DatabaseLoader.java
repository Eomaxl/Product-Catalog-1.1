package com.ecommerce.product.ECommerce.Project;

import org.springframework.beans.factory.annotation.Autowired;

import com.ecommerce.product.ECommerce.Project.Repository.ProductRepository;
import com.ecommerce.product.ECommerce.Project.model.Product;




public class DatabaseLoader {
	
	@Autowired
	private final ProductRepository repository;
	
	@Autowired
	public DatabaseLoader(ProductRepository repository) {
		this.repository = repository;
	}
	
	public void run(String... strings) throws Exception {
		this.repository.save(new Product());
			
	}
	
	

}
