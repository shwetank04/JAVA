package com.luv2code.hibernate.demo;

public class Laptop implements Comparable<Laptop> {

	private String brand;
	private int ram;
	private int price;

	public Laptop(String brand, int ram, int price) {
		super();
		this.brand = brand;
		this.ram = ram;
		this.price = price;
	}

	public String getBrand() {
		return brand;
	}

	public void setBrand(String brand) {
		this.brand = brand;
	}

	public int getRam() {
		return ram;
	}

	public void setRam(int ram) {
		this.ram = ram;
	}

	public int getPrice() {
		return price;
	}

	public void setPrice(int price) {
		this.price = price;
	}

	@Override
	public String toString() {
		return "Employee [brand=" + brand + ", ram=" + ram + ", price=" + price + "]";
	}

	@Override
	public int compareTo(Laptop lap2) {

		if (this.getRam() > lap2.getRam()) {
			return 1;
		} else if (this.getRam() < lap2.getRam()) {
			return -1;
		} else {
			return 0;
		}
	}

}
