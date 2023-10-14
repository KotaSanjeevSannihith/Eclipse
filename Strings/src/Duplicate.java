public class Duplicate 
{
	public static void main(String[] args) 
	{
		String s1="hello all",s2="";
		for(int x=0;x<s1.length();x++)
		{
			if(s2.indexOf(s1.charAt(x))==-1)
				s2+=s1.charAt(x);
		}
		System.out.println(s2);
	}

}
