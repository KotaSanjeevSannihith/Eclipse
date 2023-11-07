package com.abstraction.one;

public class MethodHiding {

	public static void main(String[] args) 
	{
		Parent p=new Child();
		p.m1();
	}

}
class Parent
{
	static void m1()
	{
		System.out.println("Parent");
	}
}
class Child extends Parent
{
	static void m1()
	{
		System.out.println("Child");
	}
}