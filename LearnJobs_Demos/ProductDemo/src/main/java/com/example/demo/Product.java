package com.example.demo;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
//@Table(name = "product_view")
public class Product {//product
	
	
	
	@Id
	@Column(name="productid")
	Integer productId;//product_id
	
	@Column(name="productname")
	String productName;//product_name
	
	@Column(name="productdescription")
	String productDescription;//product_desription
	
	public Product() {
		
	}

	public Integer getProductId() {
		return productId;
	}

	public void setProductId(Integer productId) {
		this.productId = productId;
	}

	public String getProductName() {
		return productName;
	}

	public void setProductName(String productName) {
		this.productName = productName;
	}

	public String getProductDescription() {
		return productDescription;
	}

	public void setProductDescription(String productDescription) {
		this.productDescription = productDescription;
	}

	public Product(Integer productId, String productName, String productDescription) {
		super();
		this.productId = productId;
		this.productName = productName;
		this.productDescription = productDescription;
	}

	@Override
	public String toString() {
		return "Product [productId=" + productId + ", productName=" + productName + ", productDescription="
				+ productDescription + "]";
	}
	
	
	

}
