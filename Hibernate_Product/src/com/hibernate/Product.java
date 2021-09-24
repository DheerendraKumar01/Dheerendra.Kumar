package com.hibernate;

public class Product {
  //this is called property
	private int id;
	private String ProductName;
	private String ProductBrand;
	private int cost;

	public Product() {
	}

	public Product(String ProductName, String ProductBrand, int cost) {
		super();

		this.ProductName = ProductName;
		this.ProductBrand = ProductBrand;
		this.cost = cost;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getProductName() {
		return ProductName;
	}

	public void setProductName(String ProductName) {
		this.ProductName = ProductName;
	}

	public String getProductBrand() {
		return ProductBrand;
	}

	public void setProductBrand(String ProductBrand) {
		this.ProductBrand = ProductBrand;
	}

	public int getcost() {
		return cost;
	}

	public void setcost(int cost) {
		this.cost = cost;
	}

}
