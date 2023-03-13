package com.prowings.exception.multicatch;

public class MultiCatchDemo {
	

	public static void main(String[] args) {
		
		int[] nums = {10,20,30,40};
		int res = 0;
		
		try {
			res = nums[5] / 0;
		}
		catch (Exception e) {
			System.out.println("Exception occurred!!");
			System.out.println(e.getMessage());
		}

		
	}

}
