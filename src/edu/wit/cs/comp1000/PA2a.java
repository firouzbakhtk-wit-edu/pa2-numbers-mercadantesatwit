package edu.wit.cs.comp1000;

import java.util.Scanner;
/**
 * PA2a class reads 5 whole numbers from user input and compute
 * various statistics, including the sum and average of positive and 
 * non-positive numbers.
 * 
 * This program prompts the user to enter five whole numbers, 
 * calculates the sum and averages of the positive and non-positive
 * numbers, and prints these statistics with appropriate labels.
 * 
 * Author: Sydney Mercadante
 */
public class PA2a {
	/**
	 * The main method to execute the program.
	 * 
	 * This method initializes the scanner for user input, prompts
	 * the user to enter 5 whole numbers, calculates sums and
	 * averages, and prints the results.
	 * 
	 * @param args Command-line arguments, ignored
	 */

	// Sydney Mercadante
	public static void main(String[] args) {
	
		// Created a scanner to read input from user
		Scanner input = new Scanner(System.in);
	
		// Prompts the user to enter 5 whole numbers
		System.out.printf("Enter five whole numbers: ");
		
		// Variables initialized and reads 5 integers from the user
		int num1 = input.nextInt();
		int num2 = input.nextInt();
		int num3 = input.nextInt();
		int num4 = input.nextInt();
		int num5 = input.nextInt();
		
		// Initializes the sums and counts for positive and non-postive numbers
		int positiveSum = 0; // Sum of positive numbers
		int nonpositiveSum = 0; // Sum of non-positive numbers
		int totalSum = num1 + num2 + num3 + num4 + num5; // total sum of all five numbers
		
	
		
		int positiveCount = 0; //Count of positive numbers
	    int nonpositiveCount = 0; //Count of non-positive numbers
		
	    // Checks each number and categorize it pos or neg
		if (num1>0) {
			positiveSum += num1; // add to pos. sum
			positiveCount++; // increment pos. count
		}else {
			nonpositiveSum+= num1; //add to neg sum
			nonpositiveCount++; // increment neg. count
		}
		if (num2>0) {
			positiveSum += num2; // add to pos. sum
			positiveCount++; // increment pos. count
		}else {
			nonpositiveSum+= num2; //add to neg sum
			nonpositiveCount++; // increment neg count
		}
		if (num3>0) {
			positiveSum += num3; //add to pos sum
			positiveCount++; // increment pos. count
		}else {
			nonpositiveSum+= num3; //add to neg sum
			nonpositiveCount++; // increment neg count
		}
		if (num4>0) {
			positiveSum += num4; //add to pos sum
			positiveCount++; // increment pos. count
		}else {
			nonpositiveSum+= num4; //add to neg sum
			nonpositiveCount++; // increment neg count
		}
		if (num5>0) {
			positiveSum += num5; //add to pos sum
			positiveCount++; // increment pos. count
		}else {
			nonpositiveSum+= num5; //add to neg sum
			nonpositiveCount++; // increment neg count
		}
		// Calculates averages with checks to avoid division by zero
		double positiveAverage = positiveCount > 0 ? (double) positiveSum / positiveCount : 0.00;
		double nonpositiveAverage = nonpositiveCount > 0 ? (double) nonpositiveSum / nonpositiveCount : 0.00;
		double totalAverage = (double) totalSum / 5; //Average of all 5 numbers
		
		// outputs the results with dynamic wording for singular/plural
		 System.out.printf("The sum of the %d positive %s: %d%n", positiveCount,(positiveCount == 1 ? "number" : "numbers"), positiveSum);
	        System.out.printf("The sum of the %d non-positive %s: %d%n", nonpositiveCount, (nonpositiveCount == 1 ? "number" : "numbers"), nonpositiveSum);
	        System.out.printf("The sum of the 5 numbers: %d%n", totalSum);
	        System.out.printf("The average of the %d positive %s: %.2f%n", positiveCount, (positiveCount == 1 ? "number" : "numbers"), positiveAverage);
	        System.out.printf("The average of the %d non-positive %s: %.2f%n", nonpositiveCount, (nonpositiveCount == 1 ? "number" : "numbers"), nonpositiveAverage);
	        System.out.printf("The average of the 5 numbers: %.2f%n", totalAverage);
		
	        //Closes scanner
	        input.close();
			}
		}
	
		
	


