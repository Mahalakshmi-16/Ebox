package com.hcl;
import java.util.*;
public class LarFac {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		long num;
        Scanner s = new Scanner(System.in);
        num= s.nextLong();

        for(int i=2;i<num; i++)
        {
            while(num%i == 0)
            {
                num=num/i;
            }
        }     
            System.out.println(num);

    }

}    