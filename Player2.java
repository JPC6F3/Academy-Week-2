package com.btpn.course.week2;

public class Player2 {
	private String name;
	private String email;


	public Player2 (String initName, String initEmail) {
	      name = initName;
	      email = initEmail;
	   }

	   public String toString() {
		   for (int i=0; i < 5; i++) {
	        int id = i;
	     
	     // Can you access the blockScope variables i or id?
	     System.out.println("i at the end of the loop is " + i);
	     System.out.println("The last id is " + id);
	     }
	     // Can toString() access parameter variables in Person()?
	     return  name + ": " + email;
	   }
	   
	public static void main(String[] args) {
		// call the constructor to create a new person
	      Person2 p1 = new Person2("Sana", "sana@gmail.com");
	      System.out.println(p1.toString());

	}

}
