package com.prowings.exception.trywithresource;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class TryWithResourseDemo {
	
	
	public static void main(String[] args) {
		
		
		System.out.println("main started!!");
		
		methodUsingTryWithResource();
		
		methodUsingTryWithoutResource();
		
		System.out.println("main ended!!");
		
		
	}

	private static void methodUsingTryWithoutResource() {
		
		Connection con = null;
		try
		{
			con = DriverManager.getConnection("url");
			Statement stmt = con.createStatement();
			//do some work on DB
			
//			con.close();
		}
		catch (SQLException e) {
			System.out.println("Exceptionoccurred during connecting DB!!!");
		}
		finally
		{
			try {
				con.close();
			} catch (SQLException e) {
				System.out.println("Exception occurred during closing connecting !!!");
				e.printStackTrace();
			}
		}
		
		
	}

	private static void methodUsingTryWithResource() {
		
		try(Connection con = DriverManager.getConnection("url"))
		{
			Statement stmt = con.createStatement();
			
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	public static String readFirstLineFromFile(String path) {
	    String firstLine = null;
		try (FileReader fr = new FileReader(path); BufferedReader br = new BufferedReader(fr)) {
			firstLine =br.readLine();
			return firstLine;
			
	    } catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return firstLine;
	}

}
