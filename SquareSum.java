package com.hcl;

public class SquareSum {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int s=0,sq=0;
		for(int i=1;i<=10;i++)
		{
			s=s+i;
			sq=sq+i*i;
		}
		int diff=s*s-sq;
		System.out.println(diff);
	}

}
