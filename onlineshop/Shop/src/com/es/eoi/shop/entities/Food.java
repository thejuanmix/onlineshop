package com.es.eoi.shop.entities;

public class Food extends Article {

	private String expirationDate;
	private String allergens;
	private static final Double FOOD_VAT = 1.10;

	public String getExpirationDate() {
		return expirationDate;
	}

	public void setExpirationDate(String expirationDate) {
		this.expirationDate = expirationDate;
	}

	public String getAllergens() {
		return allergens;
	}

	public void setAllergens(String allergens) {
		this.allergens = allergens;
	}

	@Override
	public Double getTotalPrice() {
		System.out.println("CALCULADO CON EL IVA DE COMIDA");
		return this.getPrice() * FOOD_VAT;
	}

	@Override
	public String toString() {
		return "\n=========================================================" + ""
				+"\nID = " + getId() + "\nNombre = " + getName() +  "\nDescripcion = " + getDescription() + 
				"\nPrecio = " + getPrice() + "\nStock = " + getStock() +
				"\nCaducidad = " + expirationDate + "\nAllergenos = " + allergens + 
				"\n=========================================================";
	}

}
