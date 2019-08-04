package com.es.eoi.shop.entities;

import com.es.eoi.shop.interfaces.Prizable;

public abstract class Article implements Prizable {

	private int id;
	private String name;
	private String description;
	private Double price=0.0;
	private String vat;
	private Integer stock;
	private String category;
	
	private static final Double DEFAULT_VAT=1.21;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public Double getPrice() {
		return price;
	}

	public void setPrice(Double price) {
		this.price = price;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public String getVat() {
		return vat;
	}

	public void setVat(String vat) {
		this.vat = vat;
	}

	public Integer getStock() {
		return stock;
	}

	public void setStock(Integer stock) {
		this.stock = stock;
	}

	public String getCategory() {
		return category;
	}

	public void setCategory(String category) {
		this.category = category;
	}
	@Override
	public Double getTotalPrice() {		
		System.out.println("CALCULADO CON IVA DEFAULT");
		return this.getPrice()*DEFAULT_VAT;
	}

	@Override
	public String toString() {
		return "Article [name=" + name + ", price=" + price + ", stock=" + stock + ", category=" + category + "]";
	}




}
