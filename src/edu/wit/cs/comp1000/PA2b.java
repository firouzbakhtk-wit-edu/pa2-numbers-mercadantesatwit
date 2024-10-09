package edu.wit.cs.comp1000;

import java.util.Scanner;
/**
 * PA2b class to compute the roots of a quadratic equation of the form ax^2 + bx + c = 0
 * 
 * This program prompts the user to enter coefficients a, b, and c, calculates the discriminent,
 * and determines the nature of the roots (real or imaginary). It then
 * calculates the roots if they are real and prints them to the console.
 * 
 * Author: Sydney Mercadante
 */
public class PA2b {

	/**
	 * The main method to execute the program.
	 * 
	 * This method initializes the Scanner for the user inputs, prompts the user to enter
	 * the coefficients a, b, and c of the quadratic equation, calculates the discriminant,
	 * and determines the roots based on its value.
	 * 
	 * @param args Command-line arguments, ignored
	 */
	// Sydney Mercadante
	public static void main(String[] args) {
		
		//Creates the scanner
		Scanner input = new Scanner(System.in); 
		
		// Prompts the user to enter coefficients a, b, and c
		System.out.printf("Enter a b c: ");
		
		//Reads the coefficients from the user
		double a = input.nextDouble(); //Coefficient a
		double b = input.nextDouble(); //Coefficient b
		double c = input.nextDouble(); //Coefficient c
		
		//Calculates the discriminant (b^2 -4ac)
		double discriminant = b * b -4 *a *c;
		
		// Determines the nature of the roots on the discriminant
		if (discriminant < 0) {
			// If the discriminant is negative the roots are imaginary
			System.out.printf("Roots: imaginary%n");
		} else if (discriminant == 0) {
			//If the discriminant is zero, there is one real root
			double root =-b/(2*a);
			System.out.printf("Root: %.2f%n", root);
		} else {
			// If the discriminant is positive, there are two distinct real roots
			double root1 = (-b - Math.sqrt(discriminant)) / (2*a); //First root
			double root2 = (-b + Math.sqrt(discriminant)) / (2*a); //Second root
			
			//Ensure root1 is the smaller root for consistent output
			if (root1> root2) {
				//Swap root1 and root2 if root1 is greater than root2
				double temp = root1;
				root1 = root2;
				root2 = temp;
			}
			//Print both roots
			System.out.printf("Roots: %.2f, %.2f%n", root1, root2);
		}
	
	}

}
