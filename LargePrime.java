package com.hcl;

import java.util.Scanner;

public class LargePrime {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s = new Scanner(System.in);
		System.out.printf("Enter i Value:");
		long n = s.nextLong();
		long lpf = n;
		long i = 2;
		while (i<=n && n!=1) {
		    if (n%i==0) {
		        n=n/i;
		        lpf= i;
		    }
		    else 
		    {
		        i = i+1;
		    }
		}
		System.out.println(lpf);
		}
		}
