package com.hcl.ebox;

import java.util.StringTokenizer;

public class StrToken {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		StringTokenizer strto=new StringTokenizer("This is my favo food");
		while(strto.hasMoreTokens())
		{
			System.out.println(strto.nextToken());
		}
			
	}

}
