package com.hcl.ebox;

public class AnonymInner {
void display()
{
	System.out.println("Outside the anonymous class");
}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
AnonymOuter ob=new AnonymOuter()
{
	int a=10;
	public void display()
	{
	 System.out.println("This is anonymous inner class");
	}
};
ob.display();
AnonymOuter ob1=new AnonymOuter();
ob1.display();
AnonymInner ob2=new AnonymInner();
ob2.display();
	}
}
