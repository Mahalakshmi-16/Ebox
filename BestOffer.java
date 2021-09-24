package com.hcl.ebox;

import java.util.Scanner;

public class BestOffer {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int p1;
		int p2;
		int p3;
		int tvalue,o1,o2;
		Scanner s=new Scanner(System.in);
		System.out.println("cost of p1:");
		p1=s.nextInt();
		System.out.println("cost of p2:");
		p2=s.nextInt();
		System.out.println("cost of p3:");
		p3=s.nextInt();
		tvalue=p1+p2+p3;
		o1=tvalue*(int)0.2;
		if(p1<p2&&p1<p3)
		{
			o2=p1;
		}
		else if (p2<p3)
		{
			o2=p2;
		}
		else
		{
			o2=p3;
		}
		if(o1>o2)
		{
			System.out.println("Go for offer1");	
		}
		else
		{
			System.out.println("Go for offer2");
		}
		
		
	}

}
