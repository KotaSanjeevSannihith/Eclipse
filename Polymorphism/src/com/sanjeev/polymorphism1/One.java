package com.sanjeev.polymorphism1;
public class One 
{
	public void isOne()
	{
		System.out.println("in default method");
	}
	public void isOne(int a,int b)
	{
		System.out.println("PC - int, int");
	}
	public void isOne(int a,char b)
	{
		System.out.println("PC - int, char");
	}
	public void isOne(char a,int b)
	{
		System.out.println("PC - char, int");
	}
}
