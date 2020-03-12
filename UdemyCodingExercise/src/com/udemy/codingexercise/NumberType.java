package com.udemy.codingexercise;

public class NumberType {

	public static boolean isDivisibleByAnyOtherNumber(long number)  {
		for (int i = 2; i < number/2; i++) {
			if (number % i == 0) {
				return true;
			}
		}
		return false;
	}
	
	public static boolean isPrime(long number) {
		if (number > 1 && !isDivisibleByAnyOtherNumber(number)) {
			return true;
		}else {
			return false;
		}
	}
	
	public static boolean isDivisible(long number, long devisor) {
		if (number % devisor == 0) {
			return true;
		} else {
			return false;
		}
	}
	
	public static long sumOfNumbersDivisibleBy3and5(long startNumber, long endNumber) {
		long sum = 0;
		for (long i = startNumber; i < endNumber; i++) {
			if (isDivisible(i, 3) && isDivisible(i, 5)) {
				sum+=i;
			}
		}
		return sum;
	}
	
	/*
	 * public static int[] getDivisibleNumbers(int startNumber, int lastNUmber, int
	 * devisor[]) { return devisor;
	 * 
	 * }
	 */
}
