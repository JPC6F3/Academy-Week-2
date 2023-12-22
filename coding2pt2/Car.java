package com.btpn.course.week2.coding2pt2;

public class Car {
	 //Declare a String color, String brand, int price
	private String color;
	private String brand;
	private int price;

    public Car(String color, String brand, int price) {
        // calls the parameterized constructor
    	this.color = color;
    	this.brand = brand;
    	this.price = price;
    }

    public Car()  { 
    //Define a parameterized constructor with parameters String color, String brand, int price)
    //Assign Constructor parameters String color, String brand, and int price to Class variables with the this keyword.
    	this.color = "white";
    	this.brand = "Honda";
    	this.price = 30000;
    }

void printCarDetails() {
    this.print();
}

private void print() {
	System.out.println(
	        "Car{color=" + color + ", brand=" + brand + ", price=" + price + '}'
	    );
}

}
