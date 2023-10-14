public class Problem 
{
	public static void main(String[] args) 
	{
		String s="a1zb2c3",s2="";
		for(int x=0;x<s.length();x++)
		{
			char c=s.charAt(x);
			if(c>='0' && c<='9')
			{
				for(int y=0;y<Character.getNumericValue(c);y++)
				{
					 s2+=s.charAt(x-1);
				}
			}
		}
		System.out.println(s2);
	}
}
