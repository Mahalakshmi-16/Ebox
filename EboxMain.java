package com.hcl.ebox;
import java.io.*;
import java.util.*;
public class EboxMain {

	//public static void main(String[] args) {
		// TODO Auto-generated method stub
			public static void main(String[] args) throws Exception{ 

				Scanner s=new Scanner(System.in);
		        System.out.println("Enter the item type name");
		        String a=s.nextLine();
		        System.out.println("Enter the cost per day");
		        double cost=s.nextDouble();
		        System.out.println("Enter the deposit");
		        double deposit=s.nextDouble();
		        
		        EboxItemType ob=new EboxItemType();
		        ob.setName(a);
		        ob.setCostPerDay(cost);
		        ob.setDeposit(deposit);
		        ob.display();
			}	

	}

