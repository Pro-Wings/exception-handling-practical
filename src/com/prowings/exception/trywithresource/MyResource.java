package com.prowings.exception.trywithresource;

public class MyResource implements AutoCloseable{

	@Override
	public void close() throws Exception {
		
		System.out.println("MyResource closed successfully!!!");
		
	}

	public void dosomething()
	{
		System.out.println("inside dosomething!!");
		int res = 20/0;
	}
	
}
