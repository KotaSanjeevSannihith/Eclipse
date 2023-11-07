package com.sanjeev.polymorphism2;
public class FinalClass 
{
	public static void main(String[] args) 
	{
		B b=new A();
		b.method1();
	}
}
class A extends B
{
	void method1()
	{
		System.out.println("Final class");
	}
}
class B
{
	void method1()
	{
		System.out.println("not a Final class");
	}
}