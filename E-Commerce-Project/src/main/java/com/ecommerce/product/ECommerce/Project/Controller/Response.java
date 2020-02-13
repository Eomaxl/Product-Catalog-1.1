package com.ecommerce.product.ECommerce.Project.Controller;

public class Response {
	private String savedProductId;

    public Response(String savedId) {
        this.savedProductId = savedId;
    }

    public String getSavedId() {
        return savedProductId;
    }

    public void setSavedId(String savedId) {
        this.savedProductId = savedId;
    }

}
