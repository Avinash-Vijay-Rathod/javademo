package com.udemy.codingexercise;

public class NumberInWord {

	public static void printNumberInWord(int number) {
		
		String text;
		// using if-else-if ladder.
		
		if (number == 0) {
			text = "ZERO";
		} else if (number == 1) {
			text = "ONE";
		} else if (number == 2) {
			text = "TWO";
		} else if (number == 3) {
			text = "THREE";
		} else if (number == 4) {
			text = "FOUR";
		} else if (number == 5) {
			text = "FIVE";
		} else if (number == 6) {
			text = "SIX";
		} else if (number == 7) {
			text = "SEVEN";
		} else if (number == 8) {
			text = "EIGHT";
		} else if (number == 9) {
			text = "NINE";
		} else {
			text = "OTHER";
		}
		
		System.out.println(text);
	}
}
