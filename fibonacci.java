package com.hcl;
import java.math.BigInteger;
public class fibonacci
{	
		private static final int DIGITS=1000;
		public String run() 
		{
			BigInteger lower=BigInteger.TEN.pow(DIGITS-1);
			BigInteger upper=BigInteger.TEN.pow(DIGITS);
			BigInteger pr=BigInteger.ONE;
			BigInteger cu=BigInteger.ZERO;
			for(int i=0; ;i++) 
			{
				if(cu.compareTo(upper)>=0)
					throw new RuntimeException("not appear");
				else if(cu.compareTo(lower)>=0)
					return Integer.toString(i);
				BigInteger temp=cu.add(pr);
				pr=cu;
				cu=temp;
			}
		}
		public static void main(String[] args)
		{
			fibonacci ob=new fibonacci();
			System.out.println(ob.run());
		}	
	}