package com.prowings.exception.trywithresource;

public class TestCustomResourceWithTry {
	
	
	public static void main(String[] args) {
		
		System.out.println("main started!!");
		
		try(MyResource mr = new MyResource())
		{
			System.out.println("try started!!");
			
			mr.dosomething();
			
			System.out.println("try ended!!");
		}
		catch (ArithmeticException e) {
			
			System.out.println("arithmatic exception catched!!!");
		}
		catch (Exception e) {
			
			System.out.println("exception occurred while closing the resource!!!");
		}
		
		System.out.println("main ended!!");
		
	}

}
