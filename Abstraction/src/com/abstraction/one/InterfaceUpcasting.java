package com.abstraction.one;

public class InterfaceUpcasting 
{
	public static void main(String[] args) 
	{
		Himpl h=new Himpl();
		h.aA();
	}
}
interface Hi
{
	void mHi();
}
class AA
{
	void aA()
	{
		System.out.println("class AA");
	}
}
class Himpl extends AA implements Hi
{
	@Override
	public void mHi() 
	{
		System.out.println("class Himpl");
	}
}