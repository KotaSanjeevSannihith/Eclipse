package com.w3schools;

public class Evenlength {

	public static void main(String[] args) {
		String s=new String("Hello all good morning how are you");
		String []s1=s.split(" ");
		for(int x=0;x<s1.length;x++)
		{
			if(s1[x].length()%2==0)
				System.out.println(s1[x]);
		}
		char c='c';
		char k='k';
		System.out.println(Character.toString(c)+Character.toString(k)); 
		
	}

}
