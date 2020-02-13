package com.ecommerce.product.ECommerce.Project.ExceptionHandler;

public class ExceptionResponse {

	private String 	productId;
    private String 	productName;
    private Integer productPrice;
    private String  productColor;
    private String 	productBrand;
    private String 	productSeller;
    private String 	productSize;
	public ExceptionResponse(String productId, String productName, Integer productPrice, String productColor,
			String productBrand, String productSeller, String productSize) {
		super();
		this.productId = productId;
		this.productName = productName;
		this.productPrice = productPrice;
		this.productColor = productColor;
		this.productSeller = productSeller;
		this.productSize = productSize;
	}
	public ExceptionResponse(Object productId2, Object productName2, Object productPrice2, Object productColor2,
			Object productBrand2, Object productSeller2, Object productSize2) {
		// TODO Auto-generated constructor stub
	}
	public String getProductId() {
		return productId;
	}
	public String getProductName() {
		return productName;
	}
	public Integer getProductPrice() {
		return productPrice;
	}
	public String getProductColor() {
		return productColor;
	}
	public String getProductBrand() {
		return productBrand;
	}
	public String getProductSeller() {
		return productSeller;
	}
	public String getProductSize() {
		return productSize;
	}
    
    
}
