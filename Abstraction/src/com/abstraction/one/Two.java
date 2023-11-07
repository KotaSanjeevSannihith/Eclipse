package com.abstraction.one;
public class Two 
{
	public static void main(String[] args) 
	{
		Cimpl c=new Cimpl();
		c.one();
		c.two();
		c.three();
		c.four();
	}
}
interface C		//can't create an object for interface but can create reference for C in Cimpl class
{
	public void one();
	public default void two()
	{
		System.out.println("two - C");
	}
}
interface D
{
	public void three();
}
interface E
{
	public void four();
}
class Cimpl implements C,D,E
{
	@Override
	public void one()
	{
		System.out.println("one - Cimpl");
	}
	@Override
	public void two()
	{
		System.out.println("two - Cimpl");
	}
	@Override
	public void four() 
	{
		System.out.println("four - Cimpl");
	}
	@Override
	public void three() 
	{
		System.out.println("three - impl");
	}
}