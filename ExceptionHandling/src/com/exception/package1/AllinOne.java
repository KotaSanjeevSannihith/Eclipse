package com.exception.package1;

import java.util.Scanner;

public class AllinOne 
{
	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Required");
		int req=sc.nextInt();
		System.out.println("Total");
		int bal=sc.nextInt();
		Bank.withDrawl(req, bal);
	}
	class Bank
	{
		static void withDrawl(int required,int total)
		{
			if(required<=total)
			{
				total=total-required;
				System.out.println("New total "+total);
			}
			else
			{
				try
				{
					throw new ArithmeticException("Hello");
				}
				catch(ArithmeticException ae)
				{
					System.out.println("Enter amount less than Total");
				}
				
			}
		}
	}
}
