package com.prowings.exception.delegation;

import java.io.IOException;

public class ThrowDemo {
	
	public static void main(String[] args) {
		
		System.out.println("main started!!");
		
		m1();
		
		System.out.println("main ended!!");
		
		
	}

	private static void m1() {
		System.out.println("m1 started!!");
		
		try {
			System.out.println("try started");
			
			int res = 20/0;
		}
		catch(ArithmeticException e)
		{
			System.out.println("Arithmatic ex occurred but converting it to NPE!!");
			
			throw new NullPointerException();
		}
		
		
	}

}
