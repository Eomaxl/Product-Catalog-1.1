package com.ecommerce.product.ECommerce.Project;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotEquals;
import static org.junit.Assert.assertNotNull;

import org.junit.Test;

import com.ecommerce.product.ECommerce.Project.model.Product;


public class ProductTest {

	  @Test
	    public void testProduct(){
	        Product sameProduct0 = new Product("B41096","Socks", 5, "blue","Puma","DMart","Medium");
	        Product sameProduct1 = new Product("B41096","Socks", 5, "blue","Puma","DMart","Medium");
	        Product otherProduct = new Product("B41006","Tie", 9, "Red","Addidas","Big Basket","Small");

	        assertEquals(sameProduct0, sameProduct1);
	        assertNotEquals(sameProduct0, otherProduct);
	        assertNotNull(sameProduct0);
	    }
}
