package com.sanjeev.polymorphism1;

public class StaticVar
{
	static
	{
		System.out.println("In Static");
	}
	static int a;
	public static void main(String[] args) 
	{
		a=10;
		//System.out.println(a);
		System.out.println("In main");
	}
}
