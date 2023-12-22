package com.btpn.course.week2;

public class Car2 {

	private String color = "";
	private String brand = "";
	private int price = 0;
	
	public Car2(String color, String brand, int price) {
		this.color = color;
		this.brand = brand;
		this.price = price;
	}
	
	public void printCarDetails() {
		System.out.println("Color: " + color);
		System.out.println("Brand: " + brand);
		System.out.println("Price: " + price);
	}
	
	public static void main(String[] args) {
		Car2 newCar = new Car2("Red", "Ferrari", 1000000);
		newCar.printCarDetails();
	}

}
