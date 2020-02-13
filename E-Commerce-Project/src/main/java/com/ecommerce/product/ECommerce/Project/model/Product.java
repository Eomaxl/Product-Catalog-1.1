package com.ecommerce.product.ECommerce.Project.model;

import javax.persistence.Entity;
import javax.persistence.Id;

import org.springframework.stereotype.Component;

@Entity
@Component
public class Product {

    @Id
    private String 	productId;
    private String 	productName;
    private Integer productPrice;
    private String  productColor;
    private String 	productBrand;
    private String 	productSeller;
    private String 	productSize;
   

    public Product() {
    }

    public Product(String productId, String productName, Integer productPrice, String productColor, String productBrand,
			String productSeller, String productSize) {
		super();
		this.productId = productId;
		this.productName = productName;
		this.productPrice = productPrice;
		this.productColor = productColor;
		this.productBrand = productBrand;
		this.productSeller = productSeller;
		this.productSize = productSize;
	}

    public String getProductId() {
		return productId;
	}

	public void setProductId(String productId) {
		this.productId = productId;
	}

	public String getProductName() {
		return productName;
	}

	public void setProductName(String productName) {
		this.productName = productName;
	}

	public Integer getProductPrice() {
		return productPrice;
	}

	public void setProductPrice(Integer productPrice) {
		this.productPrice = productPrice;
	}

	public String getProductColor() {
		return productColor;
	}

	public void setProductColor(String productColor) {
		this.productColor = productColor;
	}

	public String getProductBrand() {
		return productBrand;
	}

	public void setProductBrand(String productBrand) {
		this.productBrand = productBrand;
	}

	public String getProductSeller() {
		return productSeller;
	}

	public void setProductSeller(String productSeller) {
		this.productSeller = productSeller;
	}
	
	public String getProductSize() {
		return productSize;
	}

	public void setProductSize(String productSize) {
		this.productSize = productSize;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((productBrand == null) ? 0 : productBrand.hashCode());
		result = prime * result + ((productColor == null) ? 0 : productColor.hashCode());
		result = prime * result + ((productId == null) ? 0 : productId.hashCode());
		result = prime * result + ((productName == null) ? 0 : productName.hashCode());
		result = prime * result + ((productPrice == null) ? 0 : productPrice.hashCode());
		result = prime * result + ((productSeller == null) ? 0 : productSeller.hashCode());
		result = prime * result + ((productSize == null) ? 0 : productSize.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Product other = (Product) obj;
		if (productBrand == null) {
			if (other.productBrand != null)
				return false;
		} else if (!productBrand.equals(other.productBrand))
			return false;
		if (productColor == null) {
			if (other.productColor != null)
				return false;
		} else if (!productColor.equals(other.productColor))
			return false;
		if (productId == null) {
			if (other.productId != null)
				return false;
		} else if (!productId.equals(other.productId))
			return false;
		if (productName == null) {
			if (other.productName != null)
				return false;
		} else if (!productName.equals(other.productName))
			return false;
		if (productPrice == null) {
			if (other.productPrice != null)
				return false;
		} else if (!productPrice.equals(other.productPrice))
			return false;
		if (productSeller == null) {
			if (other.productSeller != null)
				return false;
		} else if (!productSeller.equals(other.productSeller))
			return false;
		if (productSize == null) {
			if (other.productSize != null)
				return false;
		} else if (!productSize.equals(other.productSize))
			return false;
		return true;
	}
	
}