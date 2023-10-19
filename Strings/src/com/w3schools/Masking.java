package com.w3schools;

public class Masking {

	public static void main(String[] args) 
	{
		String s1="the quick brown fox";
		String s2="queen";
		char c1[]=s1.toCharArray();
		char c2[]=s2.toCharArray();
		boolean b[]=new boolean[c1.length];
		int x,y;
		for(x=0;x<c2.length;x++)
		{
			for(y=0;y<c1.length;y++)
			{
				if(b[y])
				{
					continue;
				}
				else if(c1[y]==c2[x])
				{
					b[y]=true;
				}
			}
			
		}
		for(int z=0;z<c1.length;z++)
		{
			if(b[z]==false)
				System.out.print(c1[z]);
		}
	}

}
