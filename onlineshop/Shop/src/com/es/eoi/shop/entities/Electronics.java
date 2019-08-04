package com.es.eoi.shop.entities;

public class Electronics extends Article {

	private String power;
	private Double guarantee;
	private static final Double ELECTRONICS_VAT = 1.21;

	public String getPower() {
		return power;
	}

	public void setPower(String power) {
		this.power = power;
	}

	public Double getGuarantee() {
		return guarantee;
	}

	public void setGuarantee(Double guarantee) {
		this.guarantee = guarantee;
	}

	@Override
	public Double getTotalPrice() {
		System.out.println("CALCULADO CON EL IVA DE ELECTRONICA");
		return this.getPrice() * ELECTRONICS_VAT;
	}

	@Override
	public String toString() {
		return "\n=========================================================" + "" + 
				"\nID = " + getId() + "\nNombre = "
				+ getName() + "\nDescripcion = " + getDescription() + "\nPrecio = " + getPrice() + "\nStock = "
				+ getStock() + "\nVoltaje = " + power + "\nGarantia = " + guarantee
				+ "\n=========================================================";
	}

}
