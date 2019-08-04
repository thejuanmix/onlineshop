package com.es.eoi.shop.entities;

public class Textile extends Article {

	private String color;
	private String size;
	private static final Double TEXTILE_VAT = 1.21;

	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		this.color = color;
	}

	public String getSize() {
		return size;
	}

	public void setSize(String size) {
		this.size = size;
	}

	@Override
	public Double getTotalPrice() {
		System.out.println("CALCULADO CON IVA TEXTIL");
		return this.getPrice() * TEXTILE_VAT;
	}

	@Override
	public String toString() {
		return "\n=========================================================" + ""
				+ "\nID = " + getId() + "\nNombre = " + getName() +  "\nDescripcion = " + getDescription() + 
				"\nPrecio = " + getPrice() + "\nStock = " + getStock() +
				"\nColor = " + color + "\nTalla = " + size + 
				"\n=========================================================";
	}

}
