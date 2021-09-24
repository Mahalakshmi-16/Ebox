package com.hcl.ebox;

public class StringDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s="The example of String method";
		System.out.println(s.substring(3,8));
		System.out.println(s.compareTo("The example of string"));
		System.out.println(s.replace('e','a'));
		System.out.println(s.equalsIgnoreCase("the example of string method"));
		System.out.println(s.indexOf('o'));
		System.out.println(s.length());
		System.out.println(s.trim());
		System.out.println(s=="the example of String method");
		}
	}
