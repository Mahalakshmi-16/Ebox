//21
package com.hcl;
public class Amicable{
			public static void main(String[] args) {
				int i,j,z,a,b,sumPairs;
				sumPairs=0;
				for(i=1;i<10000;i++){
				  a=0;
				  for(j=1;j<i;j++){
				    if(i%j==0)    
				      a+=j;
				  }
				  b=0;
				  for(z=1;z<a;z++){
				    if(a%z==0)
				      b+=z;
				  }
				  if(b==i&&b!=a)
				    sumPairs+=i;  
				}
		System.out.println(sumPairs);
	}
}
