package com.abstraction.one;

public class Problem1nov1 
{
	public static void main(String[] args) 
	{
		B1 b1=new Bimpl();
		b1.m1();b1.m2();
	}
}
interface A1
{
	void m1();
}
interface B1 extends A1
{
	void m2();
}
class Bimpl implements B1
{
	@Override
	public void m1() 
	{
		System.out.println("Interface A");
	}
	@Override
	public void m2() 
	{
		System.out.println("Interface B");
	}
}