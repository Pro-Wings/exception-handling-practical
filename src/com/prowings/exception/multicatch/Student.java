package com.prowings.exception.multicatch;

public class Student implements Cloneable{
	
	int roll;
	String name;
	
	public Student(int roll, String name) {
		super();
		this.roll = roll;
		this.name = name;
	}

	public Student() {
		super();
		// TODO Auto-generated constructor stub
	}

	@Override
	public String toString() {
		return "Student [roll=" + roll + ", name=" + name + "]";
	}
	
public static void main(String[] args) {
		
		Student s1 = new Student(10, "Ram");

		Student s2 = null;
		try {
			s2 = (Student) s1.clone();
		} catch (CloneNotSupportedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		System.out.println(s1);
		System.out.println(s2);
		
	}
	

}
