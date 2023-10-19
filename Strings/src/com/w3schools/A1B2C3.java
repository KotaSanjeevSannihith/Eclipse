package com.w3schools;
public class A1B2C3 
{
	public static void main(String[] args) 
	{
		String s1="a10b2c3";
		String temp1="",temp2="";
		for(int x=0;x<s1.length();x++)
		{
			temp1="";
			if(s1.charAt(x)<'0' || s1.charAt(x)>'9')
			{
				temp1+=s1.charAt(x);
				temp2="";
				for(int y=x+1;y<s1.length();y++)
				{
					if(s1.charAt(y)>='0' && s1.charAt(y)<='9')
					{
						temp2+=s1.charAt(y);
					}
					else
						break;
				}
			}
			for(int kl=0;kl<Integer.parseInt(temp2);kl++)
			{
				
				System.out.print(temp1);
			}
		}
	}

}
