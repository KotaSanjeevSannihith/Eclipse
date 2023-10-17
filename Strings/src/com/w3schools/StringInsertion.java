package com.w3schools;
public class StringInsertion 
{
	public static void main(String[] args) 
	{
		String s1=new String("a10b11c12");
		int cf=0;
		char k=' ';
		String s="";
		for(int x=0;x<s1.length();x++)
		{
			cf=0;
			if(s1.charAt(x)>='0'&&s1.charAt(x)<='9')
			{
				s+=s1.charAt(x);
				cf=Integer.parseInt(s);
			}
			else
			{
				s="";
				k=s1.charAt(x);
			}
			for(int y=cf-cf/10;y>0;y--)
			{
				System.out.print(k);
			}
		}
	}

}
