package com.prowings.exception;

public class ExceptionDemo1 {
	
	public static void main(String[] args) {
		
		System.out.println("hello 1");
		System.out.println("hello 2");
		System.out.println("hello 3");
		System.out.println("hello 4");
		System.out.println("hello 5");
		int res = division(10 , 0);
		System.out.println(res);
		System.out.println("hello 6");
		System.out.println("hello 7");
		System.out.println("hello 8");
		System.out.println("hello 9");
		System.out.println("hello 10");
		
	}

	public static int division(int a, int b) {
		int res = 0;
		try {
			res = a/b;
		}
		catch (ArithmeticException e) {
			System.out.println("Can not divide with zero!!! please enter another number");
		}
		return res;
	}

}
