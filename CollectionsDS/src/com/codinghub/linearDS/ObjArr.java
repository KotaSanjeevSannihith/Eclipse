package com.codinghub.linearDS;

import java.util.*;

public class ObjArr 
{
	public static void main(String[] args) 
	{
//		Object [] o1=new Object[] {'f',9,23.5,16.9f,"Hello",true};
//		for(Object temp:o1)
//		{
//			System.out.println(temp);
//		}
		ArrayList a1=new ArrayList();
		a1.add(9);
		a1.add(23.4);
		a1.add(21.7f);
		a1.add('f');
		System.out.println(a1);
		LinkedList l1=new LinkedList();
		l1.add(9);
		l1.add(23.4);
		l1.add(21.7f);
		l1.add('f');
		System.out.println(l1);
		HashSet h1=new HashSet();
		h1.add(9);
		h1.add(23.4);
		h1.add(21.7f);
		h1.add('f');
		System.out.println(h1);
	}

}
