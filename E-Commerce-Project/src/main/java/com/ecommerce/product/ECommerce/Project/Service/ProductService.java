package com.ecommerce.product.ECommerce.Project.Service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ecommerce.product.ECommerce.Project.Repository.ProductRepository;
import com.ecommerce.product.ECommerce.Project.model.Product;


@Service
public class ProductService {

//    @Autowired
//    private ProductRepository productRepository;
//
//    //Fetch All Products
//    public List<Product> findAll(){
//        return (List<Product>) productRepository.findAll();
//    }
//
//    //Add product
//    public Product save(Product product) {
//    	return productRepository.save(product);
//    }
//    
//    //Fetch all products by id
//    public Product findOneById(String productId) {
//        return productRepository.findByProductId(productId);
//    }
//    
//  //Fetch all products by name
//    public Product findOneByName(String productName) {
//        return productRepository.findOneByName(productName);
//    }
//    
//    //Fetch all products by price
//    public Product findOneByPrice(Integer productPrice) {
//        return productRepository.findOneByPrice(productPrice);
//    }
//    
//    //Fetch all products by brand
//    public List<Product> findOneByBrand(String productBrand) {
//        return (List<Product>) productRepository.findOneByProductBrand(productBrand);
//    }
//    
//    //Fetch all products by color
//    public Product findOneByColor(String productColor) {
//        return productRepository.findOneByColor(productColor);
//    }
//    
   
    
//    //Fetch all products by seller
//    public List<Product> findOneBySeller(String productSeller) {
//        return (List<Product>) productRepository.findOneBySeller(productSeller);
//    }
//    
}
