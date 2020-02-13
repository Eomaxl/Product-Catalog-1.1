package com.ecommerce.product.ECommerce.Project;

import static org.junit.Assert.assertTrue;

import java.util.List;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import com.ecommerce.product.ECommerce.Project.Repository.ProductRepository;



@RunWith(SpringRunner.class)
@SpringBootTest
public class DatabaseLoaderTest 
{
	 @Autowired
	    private ProductRepository repository;
	 
	 @Autowired
	    private DatabaseLoader loader;

	    @Test
	    public void testInsertion() throws Exception {
	        List listBefore = (List) repository.findAll();
	        loader.run("");
	        List listAfter = (List) repository.findAll();
	        assertTrue(listBefore.size() < listAfter.size());
	    }
}
