package com.hcl.ebox;
import java.util.*;
public class LuckyCustomer {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
int billno;
int date;
Scanner s=new Scanner(System.in);
System.out.println("Enter date:");
date=s.nextInt();
System.out.println("Enter bill number:");
billno=s.nextInt();
if(billno%100==date||billno%10==date&&billno%date==0)
{
	System.out.println("You are lucky");
}
else
{
	System.out.println("You are not lucky");
}
	}
}


