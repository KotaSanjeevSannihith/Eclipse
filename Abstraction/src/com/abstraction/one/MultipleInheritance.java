package com.abstraction.one;

public class MultipleInheritance {

	public static void main(String[] args) 
	{
		First f=new First();
		f.second();
		f.third();
	}
}
class First implements Second,Third
{

	@Override
	public void third() 
	{
		System.out.println("Third Interface");
	}
	@Override
	public void second() 
	{
		System.out.println("Second Interface");
	}
	
}
interface Second
{
	public void second();
}
interface Third
{
	public void third();
}