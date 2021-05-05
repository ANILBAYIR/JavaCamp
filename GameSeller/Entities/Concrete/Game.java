package Concrete;

import Abstract.Entity;

public class Game implements Entity{
	
	private int id;
	private String gameName;
	private double unitPrice;
	private double amountOfDiscount;
	private double afterDiscountPrice;
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getGameName() {
		return gameName;
	}
	public void setGameName(String gameName) {
		this.gameName = gameName;
	}
	public double getUnitPrice() {
		return unitPrice;
	}
	public void setUnitPrice(double unitPrice) {
		this.unitPrice = unitPrice;
	}
	public double getAmountOfDiscount() {
		return amountOfDiscount;
	}
	public void setAmountOfDiscount(double amountOfDiscount) {
		this.amountOfDiscount = amountOfDiscount;
	}
	public double getAfterDiscountPrice() {
		return unitPrice - (unitPrice * amountOfDiscount/100);
	}

}
