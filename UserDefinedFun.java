package com.hcl.ebox;
public class UserDefinedFun {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		double number=2,result=0;
		UserDefinedFun abc=new UserDefinedFun();	
		result=abc.findCube(number);//function call
		System.out.println(findCube(number));
		System.out.println("cube of the number "+ "is : " +result);
		  }
		public static double findCube(double number)
		{
			double cubevalue=number*number*number;
			return cubevalue;
	}

}
