package com.hcl.ebox;

public class CallByVal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int x=20;
		int y=30;
		System.out.println("x="+x+" and y="+y);
		swapFunction(x,y);
		System.out.println("x="+x+" and y "+y);

	}
	public static void swapFunction(int x,int y)
	{
		System.out.println("x="+x+" and y="+y);
		int z=x;
		x=y;
		y=z;
		System.out.println("x="+x+" and y="+y);

	}

}
