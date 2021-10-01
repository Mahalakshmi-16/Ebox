package com.hcl;

public class SmaMul {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	        System.out.println(mul());
	    }

	    public static int mul() {
	        int i = 2520;
	        boolean found = false;
	        while (!found) {
	            i=i+2520;
	            boolean isDividable = true;
	            for (int j = 11; j <= 20; j++) {
	                if (i % j != 0) {
	                    isDividable = false;
	                    break;
	                }
	            }
	            if (isDividable) {
	                found = true;
	            }
	        }
	        return i;
	    }
	}
