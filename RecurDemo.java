package com.hcl.ebox;

public class RecurDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
System.out.println(factorial(10));
	}
		public static int factorial(int n)
		{
		if(n==1)
			return 1;
		else
			return (n*factorial(n-1));

	}

}
