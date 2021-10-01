package com.hcl;

public class SumPrime {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
         int c,s=0;
         for(int i=1;i<=2000000;i++)
         {
        	 c=0;
        	 for(int j=2;j<=i/2;j++)
        	 {
        		 if(i%j==0)
        		 {
        			 c++;
        			 break;
        		 }
        	 }
        	 if(c==0 && i!=1)
        	 {
        		 s+=i;
        	 }
         }
         System.out.println(s);
	}

}
