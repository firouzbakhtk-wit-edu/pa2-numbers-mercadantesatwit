package edu.wit.cs.comp1000;

import java.util.Scanner;
public class PA2a {

	// TODO: document this function
	public static void main(String[] args) {
		 
		Scanner input = new Scanner(System.in);
		 	
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
			}
		}
	
		
	


