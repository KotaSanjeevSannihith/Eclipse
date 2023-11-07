package com.exception.package1;
class ClassNotFound
{
	public static void main(String[] args) throws ClassNotFoundException 
	{
		Class.forName("com.exception.package1.ClassNotFound");
		System.out.println("Checked Exception");
	}
}