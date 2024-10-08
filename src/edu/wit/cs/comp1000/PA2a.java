package edu.wit.cs.comp1000;

import java.util.Scanner;
public class PA2a {

	// TODO: document this function
	public static void main(String[] args) {
		 
		Scanner input = new Scanner(System.in);
		
		System.out.printf("Enter 5 whole numbers: %n");
		
		int num1 = input.nextInt();
		int num2 = input.nextInt();
		int num3 = input.nextInt();
		int num4 = input.nextInt();
		int num5 = input.nextInt();
		
		int positiveSum = 0;
		int nonpositiveSum = 0;
		int totalSum = num1 + num2 + num3 + num4 + num5;
		
		int positiveCount = 0;
		int nonpositiveCount = 0;
		
		if (num1>0) {
			positiveSum += num1;
			positiveCount++;
		}else {
			nonpositiveSum+= num1;
			nonpositiveCount++;
		}
		if (num2>0) {
			positiveSum += num2;
			positiveCount++;
		}else {
			nonpositiveSum+= num2;
			nonpositiveCount++;
		}
		if (num3>0) {
			positiveSum += num3;
			positiveCount++;
		}else {
			nonpositiveSum+= num3;
			nonpositiveCount++;
		}
		if (num4>0) {
			positiveSum += num4;
			positiveCount++;
		}else {
			nonpositiveSum+= num4;
			nonpositiveCount++;
		}
		if (num5>0) {
			positiveSum += num5;
			positiveCount++;
		}else {
			nonpositiveSum+= num5;
			nonpositiveCount++;
		}
		double positiveAverage = (double) positiveSum / positiveCount;
		double nonpositiveAverage = (double) nonpositiveSum / nonpositiveCount;
		double totalAverage = (double) totalSum / 5;
		
		 System.out.printf("Sum of positive numbers: %d%n", positiveSum);
	        System.out.printf("Sum of non-positive numbers: %d%n", nonpositiveSum);
	        System.out.printf("Sum of all numbers: %d%n", totalSum);
	        System.out.printf("Average of positive numbers: %.2f%n", positiveAverage);
	        System.out.printf("Average of non-positive numbers: %.2f%n", nonpositiveAverage);
	        System.out.printf("Average of all numbers: %.2f%n", totalAverage);
		
			}
		}
	
		
	


