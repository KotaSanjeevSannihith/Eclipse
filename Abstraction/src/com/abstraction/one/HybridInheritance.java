package com.abstraction.one;
public class HybridInheritance 
{
	public static void main(String[] args) 
	{
		Hone h1=new Hone();
		h1.hOne();h1.hTwo();h1.hThree();h1.hFour();
	}
}
class Hone implements Htwo,Hthree,Hfour
{
	void hOne()
	{
		System.out.println("H one method");
	}

	@Override
	public void hTwo() 
	{
		System.out.println("H two interface");
	}

	@Override
	public void hFour() 
	{
		System.out.println("H four interface");
	}

	@Override
	public void hThree() 
	{
		System.out.println("H three interface");
	}
	
}
interface Htwo extends Hfour
{
	void hTwo();
}
interface Hthree extends Hfour
{
	void hThree();
}
interface Hfour
{
	void hFour();
}