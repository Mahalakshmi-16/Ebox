package com.hcl;
public class Fibon {
	public static int evenFib(int n)
	{
		int x=1,y=2,s=0;
do
{
	if(y%2==0)
	{
		s=s+y;
	}
	int z=x+y;
	x=y;
	y=z;
}
while(y<n);
return s;
	}
	public static void main(String[] args) {
		System.out.println(evenFib(4000000));
	}
}
