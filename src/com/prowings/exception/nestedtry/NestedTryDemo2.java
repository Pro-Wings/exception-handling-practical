package com.prowings.exception.nestedtry;

public class NestedTryDemo2 {
	
	public static void main(String[] args) {
		
		try {
			int[] nums = {10,20,30,40,50};
			
			System.out.println(nums[5]);
			
			try {
				int x = nums[2] / 2;
			}		
			catch (ArithmeticException e2) {
	            System.out.println("division by zero is not possible");
	        }
			catch (ArrayIndexOutOfBoundsException e1) {
	            System.out.println("ArrayIndexOutOfBoundsException occurred!");
	            System.out.println("Invalid Index!!");
	        }
			finally {
				System.out.println("inner finally");
			}


		}
		catch (ArrayIndexOutOfBoundsException e1) {
            System.out.println("ArrayIndexOutOfBoundsException occurred!");
            System.out.println("Invalid Index!!");
        }
		finally {
			System.out.println("outer finally");
		}

		
	}

}
