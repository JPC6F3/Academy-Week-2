package com.btpn.course.week2;

public class Car {

	private String color = "";
	private String brand = "";
	private int price = 0;
	
	public Car(String color, String brand, int price) {
		this.color = color;
		this.brand = brand;
		this.price = price;
	}
	
	public void printCarDetails() {
		print();
	}
	
	public void print() {
		System.out.println("Color= " + color + ", Brand= " + brand + ", Price= " + price);
	}
	
	public static void main(String[] args) {
		Car newCar = new Car("Red", "Ferrari", 1000000);
		newCar.printCarDetails();
	}

}
