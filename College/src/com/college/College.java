package com.college;

import java.util.Scanner;

public class College 
{
	public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Inter/degree passout : ");
		String study=sc.next();
		UG ug=new UG();
		if(study.equalsIgnoreCase("inter"))
		{
			System.out.println("BSc or BTech : ");
			String ugpg=sc.next();
			if(ugpg.equalsIgnoreCase("btech"))
			{
				System.out.println("Avaliable courses are :\n"+"CSE\n"+"IT\n"+"ECE\n"+"EEE\n"+"Mech\n"+"Civil");
			}
			else if(ugpg.equalsIgnoreCase("bsc"))
			{
				System.out.println("Avaliable course are :\n"+"Maths.\n"+"Physics.\n"+"Chemistry.\n"+ "CS.");
			}
		}
		else if(study.equalsIgnoreCase("degree"))
		{
			System.out.println("MCA or MTech : ");
			String ugpg=sc.next();
			if(ugpg.equalsIgnoreCase("mca"))
			{
				
			}
			else if(ugpg.equalsIgnoreCase("mtech"))
			{
				
			}
		}
	}
}
class UG extends College
{
	
}
class PG extends College
{
	
}
class BTech extends UG
{
	void courseBtech(String s)
	{
		System.out.println("Avaliable courses are :\n"+"CSE\n"+"IT\n"+"ECE\n"+"EEE\n"+"Mech\n"+"Civil");
	}
	void feesBtech(String s)
	{
		if(s.equalsIgnoreCase("cse"))
			System.out.println("Fees : 1,00,000");
		else if(s.equalsIgnoreCase("it")) 
			System.out.println("Fees : 1,00,000");
		else if(s.equalsIgnoreCase("ece"))
			System.out.println("Fees : 95,000");
		else if(s.equalsIgnoreCase("eee"))
			System.out.println("Fees : 85,000");
		else if(s.equalsIgnoreCase("civil")||s.equalsIgnoreCase("mech"))
			System.out.println("Fees : 75,000");
	}
}
class BSc extends UG
{
	void courseBsc()
	{
		System.out.println("Avaliable course are :\n"+"Maths.\n"+"Physics.\n"+"Chemistry.\n"+ "CS.\n"+"Electronics");
	}
	void feesBsc(String s)
	{
		if(s.equalsIgnoreCase("Maths"))
			System.out.println("Fees : 1,00,000");
		else if(s.equalsIgnoreCase("physics")) 
			System.out.println("Fees : 1,00,000");
		else if(s.equalsIgnoreCase("chemistry"))
			System.out.println("Fees : 95,000");
		else if(s.equalsIgnoreCase("biology"))
			System.out.println("Fees : 85,000");
		else if(s.equalsIgnoreCase("cs")||s.equalsIgnoreCase("electronics"))
			System.out.println("Fees : 75,000");
	}
}
class MCA extends PG
{
	void courseMca(String s)
	{
		System.out.println("Avaliable course are :\n"+"Maths.\n"+"Physics.\n"+"Chemistry.\n"+ "CS.");
	}
	void feesMca(String s)
	{
		if(s.equalsIgnoreCase("Maths"))
			System.out.println("Fees : 1,00,000");
		else if(s.equalsIgnoreCase("physics")) 
			System.out.println("Fees : 1,00,000");
		else if(s.equalsIgnoreCase("chemistry"))
			System.out.println("Fees : 95,000");
		else if(s.equalsIgnoreCase("biology"))
			System.out.println("Fees : 85,000");
		else if(s.equalsIgnoreCase("cs")||s.equalsIgnoreCase("electronics"))
			System.out.println("Fees : 75,000");
	}
}
class MTech extends PG
{
	void courseMtech(String s)
	{
		System.out.println("Avaliable course are :\n"+"Maths.\n"+"Physics.\n"+"Chemistry.\n"+ "CS.");
	}
	void feesMtech(String s)
	{
		if(s.equalsIgnoreCase("Maths"))
			System.out.println("Fees : 1,00,000");
		else if(s.equalsIgnoreCase("physics")) 
			System.out.println("Fees : 1,00,000");
		else if(s.equalsIgnoreCase("chemistry"))
			System.out.println("Fees : 95,000");
		else if(s.equalsIgnoreCase("biology"))
			System.out.println("Fees : 85,000");
		else if(s.equalsIgnoreCase("cs")||s.equalsIgnoreCase("electronics"))
			System.out.println("Fees : 75,000");
	}
}