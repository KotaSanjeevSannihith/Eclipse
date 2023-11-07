package com.sanjeev.polymorphism1;
public class Upcasting 
{
	public static void main(String[] args) 
	{
		A a=new B();
		a.method1();
		a.method2();
		a.method3();
	}
}
class A//parent
{
	public void method1()
	{
		System.out.println("class A method1");//out dated method
	}
	public void method2()
	{
		System.out.println("class A method2");
	}
	public void method3()
	{
		System.out.println("class A method3");//out dated method
	}
}
class B extends A//child class
{
	public void method1()
	{
		System.out.println("class B method1");//updated method
	}
	public void method3()
	{
		System.out.println("class B method3");//updated method
	}
	public void method4()
	{
		System.out.println("class B method4");
	}
	public void method5()
	{
		System.out.println("class B method5");
	}
}