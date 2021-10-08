package com.hcl.ebox;
import java.io.*;
import java.util.*;
public class EboxCusMain {

		public static void main(String[] args) throws Exception, IOException {

					Scanner s=new  Scanner(System.in);
	                System.out.println("Enter the Customer Details");
	                System.out.println("Enter the name");
	                String name=s.nextLine();
	                System.out.println("Enter the email");
	                String email=s.nextLine();
	                System.out.println("Enter the type");
	                String type=s.nextLine();
	                System.out.println("Enter the location");
	                String address=s.nextLine();
	                EboxCustomer ob=new EboxCustomer(name,email,type,address);
	                ob.displayDetails();
		}
	}
