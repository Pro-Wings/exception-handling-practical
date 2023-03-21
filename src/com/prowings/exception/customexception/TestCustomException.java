package com.prowings.exception.customexception;

public class TestCustomException {
	
	public static void main(String[] args) {
		
		
		Citizen citizen = new Citizen(1234, "Ram", "India", "A17");
		
		String res = "";
		try 
		{
			res = isValidVoter(citizen) ? "Valid Voter" : "Not Valid Voter";
		} 
		catch (InvalidAgeException e) {
			System.out.println(">>>>>>>>>>>>");
			System.out.println(e.getMessage());
			System.out.println(e.getCause());
			e.printStackTrace();
			System.out.println("<<<<<<<<<<<<");
		}
		
		System.out.println(res);
	}

	
	public static boolean isValidVoter(Citizen citizen) throws InvalidAgeException
	{

		try {
		int age = Integer.parseInt(citizen.getAge());
		if(age >= 18)
			return true;
		}
		catch (Exception e) {
//			throw new InvalidAgeException("Age is below 18!!!");
			throw new InvalidAgeException("Age is below 18!!!", e);
		}
		return false;
		
	}
}

