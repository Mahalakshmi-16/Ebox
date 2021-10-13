package com.hcl.ebox;

public class StaticOuter {
static private int a=10001;
static class innerclass
{
	static void display()
	{
		System.out.println(a);
	}
}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
StaticOuter.innerclass snob=new StaticOuter.innerclass();
snob.display();
	}

}
