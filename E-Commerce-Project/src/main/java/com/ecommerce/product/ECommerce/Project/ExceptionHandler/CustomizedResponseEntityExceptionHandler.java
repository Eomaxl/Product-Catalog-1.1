package com.ecommerce.product.ECommerce.Project.ExceptionHandler;

import java.util.Date;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.util.MultiValueMap;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.context.request.WebRequest;
import org.springframework.web.servlet.function.EntityResponse;
import org.springframework.web.servlet.mvc.method.annotation.ResponseEntityExceptionHandler;



@ControllerAdvice
@RestController	
public class CustomizedResponseEntityExceptionHandler 
extends ResponseEntityExceptionHandler
{
	@ExceptionHandler(Exception.class)
	public final ResponseEntity<Object> 
	handleAllException(Exception ex, WebRequest request) {
	
		
	MultiValueMap exceptionResponse = null;
	return new ResponseEntity(exceptionResponse,HttpStatus.INTERNAL_SERVER_ERROR);
	}
	
	
	@ExceptionHandler(ProductNotFound.class)
	public final ResponseEntity<Object> 
	handleUserException(ProductNotFound ex, WebRequest request) {
	
	ExceptionResponse exceptionResponse =	new ExceptionResponse(null, null, null, null, null, null, null);
		
	return new ResponseEntity(exceptionResponse,HttpStatus.NOT_FOUND);
	}
}



