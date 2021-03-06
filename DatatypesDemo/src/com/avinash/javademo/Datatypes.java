package com.avinash.javademo;

public class Datatypes {

	public static void main(String[] args) {
		
		System.out.println("Range of Integers is "+Integer.MIN_VALUE+" to "+Integer.MAX_VALUE);
		System.out.println("Range of Bytes is "+Byte.MIN_VALUE+" to "+Byte.MAX_VALUE);
		System.out.println("Range of Short is "+Short.MIN_VALUE+" to "+Short.MAX_VALUE);
		System.out.println("Range of Long is "+Long.MIN_VALUE+" to "+Long.MAX_VALUE);
		System.out.println("Range of Float is "+Float.MIN_VALUE+" to "+Float.MAX_VALUE);
		System.out.println("Range of Double is "+Double.MIN_VALUE+" to "+Double.MAX_VALUE);
		
		// min and max values for character are not defined in wrapper class
		System.out.println("Range of Character is "+Character.MIN_VALUE+" to "+Character.MAX_VALUE);
		
		// size of data types.
		System.out.println("\n\nsize of data types.");
		System.out.println("-----------------------------");
		System.out.println("Size of Integer is : "+Integer.BYTES+" bytes");
		System.out.println("Size of Bytes is   : "+Byte.BYTES+" bytes");
		System.out.println("Size of Short is   : "+Short.BYTES+" bytes");
		System.out.println("Size of Long is    : "+Long.BYTES+" bytes");
		System.out.println("Size of Float is   : "+Float.BYTES+" bytes");
		System.out.println("Size of Double is  : "+Double.BYTES+" bytes");
		System.out.println("Size of Char is    : "+Character.BYTES+" bytes");
	}

}
