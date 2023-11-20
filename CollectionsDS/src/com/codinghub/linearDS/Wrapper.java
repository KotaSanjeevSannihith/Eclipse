package com.codinghub.linearDS;

import java.util.*;

public class Wrapper 
{
	public static void main(String[] args) 
	{
		ArrayList<Integer> al=new ArrayList<Integer>();
		al.add(25);
		al.add(36);
		al.add(49);
		al.add(64);
		System.out.println(al);
		for(int x=0;x<al.size();x++)
		{
			System.out.print(al.get(x)+"  ");
		}
		System.out.println();
		for(Integer temp : al)
			System.out.print(temp+"  ");
	}
}
