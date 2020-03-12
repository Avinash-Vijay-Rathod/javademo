package com.udemy.codingexercise;

public class IntEqualityPrinter {

	public static void printEqual(int number1, int number2, int number3) {
		
		String message;
		
		if (number1 < 0 || number2 < 0 || number3 < 0) {
			message = "Invalid Value";
		} else if (number1 == number2 && number2 == number3) {
			message = "All numbers are equal";
		} else if (number1 != number2 && number2 != number3 && number1 != number3) {
			message = "All numbers are different";
		} else {
			message = "Neither all are equal or different";
		}
		
		System.out.println(message);
	}
}
