package com.hcl.ebox;

public class EvenOdd {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
int[] array=new int[]{5,6,7,8,9};
System.out.println("Elements in odd position");
for(int i=0;i<array.length;i=i+2)
{
	System.out.println(array[i]);
}
System.out.println("Elements in even position");
for(int i=1;i<array.length;i=i+2)
{
	System.out.println(array[i]);
}
}
}