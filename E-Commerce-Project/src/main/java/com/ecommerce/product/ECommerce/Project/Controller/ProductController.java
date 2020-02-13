package com.ecommerce.product.ECommerce.Project.Controller;


import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.ecommerce.product.ECommerce.Project.ExceptionHandler.ProductNotFound;
import com.ecommerce.product.ECommerce.Project.Repository.ProductRepository;
import com.ecommerce.product.ECommerce.Project.Service.ProductService;
import com.ecommerce.product.ECommerce.Project.model.Product;





@RestController
public class ProductController {
	
	@Autowired
    private ProductRepository productRepository;
	
	
	
	/*    Add products to the database. */
    @PostMapping(path = "/add")
    public Response addNewProduct(@RequestBody Product product) 
    {
    	
    	productRepository.save(product);
        return new Response(product.getProductId());
    }
    
    
    /*    Fetch all the products from the database */
    @GetMapping(path = "/products")
    public List<Product> getAllProducts() 
    {
    	return (List<Product>) productRepository.findAll();
    }
    
 
    
    /*  Fetch the product based upon the productId    */
    @GetMapping(path = "/products/{productId}")
    public Product getProductById(@PathVariable("productId") String productId) {
    	Product product = productRepository.findByProductId(productId);
    	
    	if(product == null)
    	{
    		throw new ProductNotFound("No products found");
    	}
    	
        return product;
    }
    
    //Fetch the product based upon the productBrand
    @GetMapping(path = "/productBrand/{productBrand}")
    public Product getProductByBrand(@PathVariable("productBrand") String productBrand) {
    	Product product = productRepository.findOneByProductBrand(productBrand);
    	
    	if(product == null)
    		throw new ProductNotFound("No products found");
    	
    	return product;
    }
    
//  //Fetch the product based upon the productPrice
//    @GetMapping(path = "/products/{productPrice}")
//    public Product getProductByPrice(@PathVariable("productPrice") Integer productPrice) {
//        return productRepository.findOneByPrice(productPrice);
//    }
//    
//    //Fetch the product based upon the productName
//    @GetMapping(path = "/products/{productName}")
//    public Product getProductByName(@PathVariable("productName") String productName) {
//        return productRepository.findOneByName(productName);
//    }
//
//    //Fetch the product based upon the productColor
//    @GetMapping(path = "/products/{productColor}")
//    public Product getProductByColor(@PathVariable("productColor") String productColor) {
//        return productRepository.findOneByColor(productColor);
//    }
//    
//    //Fetch the product based upon the productSeller
//    @GetMapping(path = "/products/{productSeller}")
//    public Product getProductBySeller(@PathVariable("productSeller") String productSeller) {
//        return productRepository.findOneBySeller(productSeller);
//    }
    
//  //Fetch the product based upon the productSeller
//    @GetMapping(path = "/products/{productSize}")
//    public Product getProductBySize(@PathVariable("productSize") String productSize) {
//        return productRepository.findOneBySize(productSize);
//    }
    
    
    
//    //Create a new product
//    @PostMapping(consumes = MediaType.APPLICATION_JSON_VALUE)
//    public ResponseEntity<Object> createProduct(@RequestBody Product product) {
//       Product p = service.save(product);
//       
//       URI location = ServletUriComponentsBuilder
//    			.fromCurrentRequest()
//    			.path("/{id}")
//    			.buildAndExpand(product.getProductId())
//    			.toUri();
//    			
//       return ResponseEntity.created(location).build();
//       
//    }

}
