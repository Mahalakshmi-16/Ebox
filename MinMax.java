package com.hcl.ebox;

import java.util.*;

public class MinMax {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s=new Scanner(System.in);
		int nums=s.nextInt();
		int Maximum=Integer.MIN_VALUE;
		int Minimum=Integer.MAX_VALUE;
		System.out.println("Enter total numbers");
		for(int a=0;a<nums;a++)
		{
			int current=s.nextInt();
			if(current>Maximum)
			{
				Maximum=current;
			}
			if(current<Minimum)
			{
				Minimum=current;
			}
		}
		System.out.println("Maxmimum number:"+Maximum);
		System.out.println("Minimum number:"+Minimum);
		s.close();
	}

}

