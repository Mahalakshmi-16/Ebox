package com.hcl.ebox;

public class JaggArr {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr[][]=new int[3][3]; //don't know array size
		arr[0]=new int[8];
		arr[1]=new int[4];
		arr[2]=new int[2];
		int value=15;
		for(int i=0;i<arr.length;i++)
		{
			for(int j=0;j<arr[i].length;j++)
			{
				arr[i][j]=value++;
			}
		}
		for(int i=0;i<arr.length;i++)
		{
			for(int j=0;j<arr[i].length;j++)
			{
				System.out.print(arr[i][j]+" ");
			}
			System.out.println("");
		}
		

	}

}
