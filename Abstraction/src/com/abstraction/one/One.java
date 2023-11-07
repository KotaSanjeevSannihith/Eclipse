package com.abstraction.one;
public class One 
{
	public static void main(String[] args) 
	{
		A a=new B();
		a.add();a.sub();
	}
}
abstract class A
{
	public void add()
	{
		System.out.println("I'm in ADD - A");
	}
	public abstract void sub();
}
class B extends A
{
	public void add()
	{
		System.out.println("I'm in ADD - B");
	}
	@Override
	public void sub() 
	{
		System.out.println("I'm in SUB - B");
	}
}