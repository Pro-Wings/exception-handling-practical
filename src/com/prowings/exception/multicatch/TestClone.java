package com.prowings.exception.multicatch;

public class TestClone {

	
	public static void main(String[] args) throws ClassNotFoundException {
		
		System.out.println("main started");
		
		Class.forName("com.prowings.exception.multicatch.A");
		
		System.out.println("main ended");
	}
	
}
