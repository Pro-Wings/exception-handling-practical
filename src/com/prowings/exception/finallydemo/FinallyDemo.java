package com.prowings.exception.finallydemo;

public class FinallyDemo {
	
	public static void main(String[] args) {
		
		System.out.println("main started!!");
		m1();
		System.out.println("main ended!!");
	}
	
	
	public static void m1()
	{
		System.out.println("m1 started");
		
		try
		{
			System.out.println("inside try 1");
			int res = 10 / 0;

		}
		catch(Exception e)
		{
			System.out.println("inside catch");
		}
		finally
		{
			System.out.println("inside try 2");
			System.out.println("inside try 3");
			System.out.println("inside finally");
		}
		
		System.out.println("m1 ended");
	}
}
