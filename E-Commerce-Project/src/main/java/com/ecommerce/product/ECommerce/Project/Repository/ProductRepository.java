package com.ecommerce.product.ECommerce.Project.Repository;

import java.util.List;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.ecommerce.product.ECommerce.Project.model.Product;


@Repository
public interface ProductRepository extends CrudRepository<Product,Integer>
{

	Product findByProductId(String productId);

	
	Product findOneByProductBrand(String productBrand);

	
//	Product findOneByPrice(Integer productPrice);

	
//	Product findOneByName(String productName);
//
//
//
//	Product findOneByColor(String productColor);
//
//
//
//	Product findOneBySeller(String productSeller);



	//Product findOneBySize(String productSize);

}
