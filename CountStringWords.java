package com.hcl.ebox;

import java.util.*;

public class CountStringWords {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String a;
		int c=0;
		Scanner s=new Scanner(System.in);
		a=s.nextLine();
		for(int i=0;i<a.length()-1;i++)
		{
			if(a.charAt(i)==' '&&a.charAt(i+1)!=' ')
				c++;
		}
		
System.out.println("Total number of words in string are:"+(c+1));
	}
}
