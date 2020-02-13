package com.ecommerce.product.ECommerce.Project;

import static junit.framework.TestCase.assertTrue;
import static org.junit.Assert.assertTrue;
import static org.junit.jupiter.api.Assertions.assertTrue;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import com.ecommerce.product.ECommerce.Project.Repository.ProductRepository;
import com.ecommerce.product.ECommerce.Project.model.Product;


@RunWith(SpringRunner.class)
@SpringBootTest
public class ProductRepositoryTest {

    @Autowired
    private ProductRepository repository;

    @Test
    public void testCreateAndDelete() throws Exception {
        Product product = new Product("B110007","Chinos", 29, "Cobalt","Alven Solly","Shopper Stop","Medium");
        repository.save(product);
        //assertTrue(repository.findByProductId(product.getProductId()));
        
    }
}
