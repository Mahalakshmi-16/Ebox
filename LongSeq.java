//14
package com.hcl;
import java.util.*;
public class LongSeq 
{	
	public static void main(String[] args) {
	int lim=1000000;
	int size=0,max=1,j=0;
	for (int i=2;i<lim;i++) 
	{
		size=getChainSize(i);
		if(size>max) 
		{
			max=size;
			j=i;
		}
	}
	System.out.println(j);	
	}
private static int getChainSize(int num) 
{
	long n=num;
	List<Long> list=new ArrayList<>();
	int size=0;
	while(n!=1) 
	{
		list.add(n);
		if(n%2==0) 
		{
			n=n/2;
		} 
		else 
		{
			n=3*n+1;
	    }
	}
	size=list.size();
	return size;
}
}

