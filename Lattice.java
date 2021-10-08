package com.hcl;
public class Lattice {
	public static void main(String[] args) 
	{
		int s=21;
	      long[][] path=new long[s][s];
	      path[0][0]=1;
	      for(int i=1;i<s;i++) 
	      {
	        path[i][0]=1;
	        path[0][i]=1;
	      }
	      for(int r=1;r<s;r++) 
	      {
	        path[r][r]=path[r-1][r]+path[r][r-1];
	        for(int c=r+1;c<s;c++) {
	          path[r][c]=path[r-1][c]+path[r][c-1];
	          path[c][r]=path[c-1][r]+path[c][r-1];
	        }
	      }
	      long paths=path[s-1][s-1];
	      System.out.println("PATHS : "+paths);      
	 }
}