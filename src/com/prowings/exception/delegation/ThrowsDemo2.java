package com.prowings.exception.delegation;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class ThrowsDemo2 {
	
	public static void main(String[] args) {
		
		System.out.println("main started!!");
		
		m1();
		
		System.out.println("main ended!!");
		
	}

	private static void m1() {
		System.out.println("m1 started!!");
		
		m2();
		
		System.out.println("m1 ended!!");

		
	}

	private static void m2() {
		System.out.println("m2 started!!");
		
		m3();
		
		System.out.println("m2 ended!!");

		
	}

	private static void m3(){
		System.out.println("m3 started!!");
		
		m4();
		
		System.out.println("m3 ended!!");

		
	}

	private static void m4() throws ArithmeticException{
		System.out.println("m4 started!!");
		
//		FileReader fr = new FileReader("a2.txt");
//		fr.read();
		
		int res = 20/0;
		
		System.out.println("m4 ended!!");

		
	}

}
