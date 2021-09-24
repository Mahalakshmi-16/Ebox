package com.hcl.ebox;
public class SingleDimenArr {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int empid[]= {201,202,203,204,205};
		int sum=0;
		for(int i=0;i<5;i++)
		{
			sum=sum+empid[i];		
		}
		System.out.println("Sum of array : "+sum);
	}
}