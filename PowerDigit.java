package com.hcl;

import java.math.BigInteger;

public class PowerDigit {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        int r=0;
        String v=BigInteger.valueOf(2).pow(1000).toString();
        for(char a:v.toCharArray())
        {
        	r=r+Character.getNumericValue(a);
        }
        System.out.println(r);
	}

}
