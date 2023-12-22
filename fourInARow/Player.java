package com.btpn.course.week2.fourInARow;
import java.util.ArrayList;
import java.util.Scanner;

public class Player {
	private String name;
	private String playerNumber;
	
	Scanner scanner = new Scanner(System.in);
	
	//Constructor
	public Player(String initName, String initPlayerNumber) {
		this.name = initName;
		this.playerNumber = initPlayerNumber;
	}

	public void print(String string) {
		System.out.println(string);
	}
	
	public String getName() {
		return this.name;
	}
	
	public String getNumber() {
			return this.playerNumber;
	}

	public int makeMove() {
		print("Enter the column number for where you'd like to place your token in: ");
		int column = scanner.nextInt();
		return column;
	}
	
	public String toString() {
		String output = ("Player " + this.playerNumber + " is " + this.name);
		print(output);
		return (output);
	}
}
