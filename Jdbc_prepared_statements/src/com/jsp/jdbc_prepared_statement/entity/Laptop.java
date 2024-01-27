package com.jsp.jdbc_prepared_statement.entity;

/**
 * 
 * @author Abhishek
 */

public class Laptop {

	private int id;
	private String name;
	private String color;
	private double price;
	private String ram;

	public Laptop() {
		super();
	}

	public Laptop(int id, String name, String color, double price, String ram) {
		super();
		this.id = id;
		this.name = name;
		this.color = color;
		this.price = price;
		this.ram = ram;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		this.color = color;
	}

	public double getPrice() {
		return price;
	}

	public void setPrice(double price) {
		this.price = price;
	}

	public String getRam() {
		return ram;
	}

	public void setRam(String ram) {
		this.ram = ram;
	}

	public String toString() {
		return ("id is : " + id + ", name is : " + name + ", color is : " + color + " , price is : " + price
				+ ", ram is : " + ram);
	}

}
