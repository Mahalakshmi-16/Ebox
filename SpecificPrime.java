//7
package com.hcl;
public class SpecificPrime {
	public static boolean isPrime(int num) {
		// TODO Auto-generated method stub
		if(num%2==0)
			return false;
		else
		{
			for(int i=3;i<=(int)Math.sqrt(num);i=i+2)
			{
				if(num%i==0)
					return false;
			}
		}
             return true;
	}
	public static void main(String[] args) {
		int c=1;
		for(int i=3; ;i++)
		{
			if(isPrime(i))
				c++;
			if(c==10001)
			{
				System.out.println(i);
				break;
			}
		}
	}

}
