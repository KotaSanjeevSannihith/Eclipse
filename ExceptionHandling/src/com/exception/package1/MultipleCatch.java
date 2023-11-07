package com.exception.package1;
import java.util.*;
public class MultipleCatch {

	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter a number");
		int x=sc.nextInt();
		try
		{
			System.out.println(10/x);
			int a[]=new int[5];
			System.out.println(a[7]);
		}
		catch(ArithmeticException ae)
		{
			System.out.println("in AE");
		}
		catch(Exception ae)
		{
			System.out.println("In Exception");
		}
	}

}
