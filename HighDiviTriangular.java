package com.hcl;

public class HighDiviTriangular {

	public static int triangleNumber(int n) {
		// TODO Auto-generated method stub
		int sum=0;
		for(int i=0;i<=n;i++)
			sum=sum+i;
		return sum;

	}
	public static void main(String[] args)
	{
		long start=System.currentTimeMillis();
		int j=0,n=0,nod=0;
		while(nod<=500)
		{
			j++;
		n=triangleNumber(j);
		for(int i=1;i<=Math.sqrt(n);i++)
			if(n%i==0)
				nod++;
		nod=nod*2;
	}
	long finish=System.currentTimeMillis();
	System.out.println(20);
	System.out.println("Time taken:"+(finish-start)+" milliseconds");
}
}
