package com.btpn.course.week2;

public class TesterClass_DebuggingChallenge {

	public static void main(String[] args) {
		Fraction f1 = new Fraction();
	    Fraction f2 = new Fraction(1,2);
	    System.out.println(f1.toString()); //Invoked toString method
	    System.out.println(f2.toString()); //Invoked toString method
	   }
	 }


/** Class Fraction */
class Fraction {
   //  instance variables
   private int numerator; //Class scope
   private int denominator; //Class scope
   private int d = 1; //Added: Variable now accessible within class. Class scope
   
   // constructor: set instance variables to default values
   public Fraction() {
      /*  int d = 1; Removed: method scope */
      numerator = d;
      denominator = d;
   }

   // constructor: set instance variables to init parameters
   public Fraction(int initNumerator, int initDenominator) {
      numerator = initNumerator;
      denominator = initDenominator;
   }

   public String toString() {
     // if the denominator is 1, then just return the numerator
     if (denominator == d) {
      /*  int newNumerator = 1; Removed: Erroneous logic, should return denominator. Block scope. */
    	 return numerator + "";
     }
     return numerator + "/" + denominator; //Adjusted from newNumerator to numerator
   }
}

