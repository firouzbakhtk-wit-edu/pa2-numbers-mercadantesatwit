package edu.wit.cs.comp1000;

import java.util.Scanner;
public class PA2b {

	// Sydney Mercadante
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in); 
		
		System.out.printf("Enter a b c: %n");
		double a = input.nextDouble();
		double b = input.nextDouble();
		double c = input.nextDouble();
		
		double discriminant = b * b -4 *a *c;
		
		if (discriminant < 0) {
			System.out.printf("Roots: imaginary%n");
		} else if (discriminant == 0) {
			double root =-b/(2*a);
			System.out.printf("Root: %.2f%n", root);
		} else {
			double root1 = (-b - Math.sqrt(discriminant)) / (2*a);
			double root2 = (-b + Math.sqrt(discriminant)) / (2*a);	
			if (root1> root2) {
				double temp = root1;
				root1 = root2;
				root2 = temp;
			}
			System.out.printf("Roots: %.2f, %.2f%n", root1, root2);
		}
	}

}
