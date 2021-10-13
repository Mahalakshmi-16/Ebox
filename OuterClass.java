package com.hcl.ebox;

//import com.hcl.ebox.OuterClass.InnerClass;

public class OuterClass {
private int accid=1234;
void show()
{
	class InnerClass //local inner class
	{
		void displaymessage()
		{
			System.out.println("welcome to outerclass");
		}
	}
		InnerClass obj=new InnerClass();
		obj.displaymessage();
	
}

public class InnerClass{
void display()
{
	System.out.println("Acc id is "+accid);
}
void show()
{
	System.out.println("welcome to innerclass");
}
}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		OuterClass ob1=new OuterClass();
		OuterClass.InnerClass ob2=ob1.new InnerClass();
	System.out.println("innerclass value");
		ob2.display();
		ob2.show();
		ob1.show();
	}

}
