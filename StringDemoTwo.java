package com.hcl.ebox;

public class StringDemoTwo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s1=new String();
		char a[]= {'h','e','l','l','o'};
		String s2=new String(a);
		byte b[]= {'w','o','r','l','d'};
		String s3=new String(b);
		String s4=new String(a,1,3);
		String s5=new String(s2);
		String s6=s2;
		System.out.println(s1);
		System.out.println(s2);
		System.out.println(s3);
		System.out.println(s4);
		System.out.println(s5);
		System.out.println(s6);
	}
	}


