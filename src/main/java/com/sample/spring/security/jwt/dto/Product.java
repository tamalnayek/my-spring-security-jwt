package com.sample.spring.security.jwt.dto;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

//@Data
//@AllArgsConstructor
//@NoArgsConstructor
//@Builder
public class Product {

	private int productId;
	private String name;
	private int qty;
	private double price;

	public Product() {
	}

	public Product(int productId, String name, int qty, double price) {
		super();
		this.productId = productId;
		this.name = name;
		this.qty = qty;
		this.price = price;
	}	

	public int getProductId() {
		return productId;
	}

	public void setProductId(int productId) {
		this.productId = productId;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getQty() {
		return qty;
	}

	public void setQty(int qty) {
		this.qty = qty;
	}

	public double getPrice() {
		return price;
	}

	public void setPrice(double price) {
		this.price = price;
	}

	public static ProductBuilder builder() {
		return new ProductBuilder();
	}

	public static class ProductBuilder {
		private int productId;
		private String name;
		private int qty;
		private double price;
		
		public ProductBuilder productId(int productId) {
			this.productId = productId;
			return this;
		}
		
		public ProductBuilder name(String name) {
			this.name = name;
			return this;
		}
		
		public ProductBuilder qty(int qty) {
			this.qty = qty;
			return this;
		}
		
		public ProductBuilder price(double price) {
			this.price = price;
			return this;
		}
		
		public Product build() {
			return new Product(productId, name, qty, price);
		}

		@Override
		public String toString() {
			return "ProductBuilder [productId=" + productId + ", name=" + name + ", qty=" + qty + ", price=" + price
					+ "]";
		}
		
				
	}

}