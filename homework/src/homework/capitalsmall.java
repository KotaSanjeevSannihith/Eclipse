package homework;
class capitalsmall
{
	public static void main(String args[]) 
	{
		String str="Chocolate";
		String s1="";
		for(int x=0;x<str.length();x++)
		{
			if(x>=3)
			{
				break;
			}
			else if(x<=2)
			{
				s1+=str.charAt(x);
			}
		}
		String s2="";
		int n=3;
		for(int y=n;y>0;y--)
		{
			s2+=s1;
		}
		System.out.println(s2);
	}
}