//9
package com.hcl;

public class SpecialPythTrip {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		for(int x=3;x<=1000;x++)
		{
			for(int y=x+1;y<1000;y++)
			{
				double z=Math.pow(x, 2)+Math.pow(y, 2);
				double k=Math.pow(z,0.5);
				if(x+y+k==1000)
				{
					System.out.println(x*y*k);
					break;
				}
			}
		}

	}

}
