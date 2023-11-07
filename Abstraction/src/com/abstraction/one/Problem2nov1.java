package com.abstraction.one;

public class Problem2nov1 
{
	public static void main(String[] args) 
	{
		A2 a=new B2();
		a.oneA();
	}
}
class A2
{
	void oneA()
	{
		System.out.println("A2 oneA");
	}
}
class B2 extends A2
{
	void oneA()
	{
		System.out.println("B2 oneA");
	}
}