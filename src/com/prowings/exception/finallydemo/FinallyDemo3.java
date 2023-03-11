package com.prowings.exception.finallydemo;

public class FinallyDemo3 {
	
	public static void main(String[] args) {
		
		System.out.println("main started!!");
		int res = m1();
		System.out.println(res);
		System.out.println("main ended!!");
	}
	
	
	public static int m1()
	{
		try
		{
			System.out.println("inside try 1");
			int res = 10/0;
			System.out.println("inside try 2");
			System.out.println("inside try 3");
			return 10;
			
		}
		catch(Exception e)
		{
			System.out.println("inside catch");
			return 20;
		}
		finally
		{
			System.out.println("inside finally");
			return 30;
		}
		
	}
}
