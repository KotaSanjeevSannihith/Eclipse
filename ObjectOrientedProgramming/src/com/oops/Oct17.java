package com.oops;
public class Oct17 
{
	public static void main(String[] args) 
	{
		Demo demo1=new Demo();
		Demo demo2=new Demo(1,2);
		demo1.print();
		demo2.print();
	}
}
class Demo
{
	int a,b;
	Demo()
	{
		a=100;b=200;
	}
	Demo(int a,int b)
	{
		this.a=a;//LOCAL INSTANCES: to increase the scope of local variables
		this.b=b;//'this' will point to the instance variable of the current class
	}
	void print()
	{
		System.out.println(a);
		System.out.println(b);
	}
}