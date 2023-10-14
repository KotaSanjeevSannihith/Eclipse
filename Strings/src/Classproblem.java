public class Classproblem 
{
	public static void main(String[] args) 
	{
		String s="HeLlo All gOOd MorNinG";
		for(int x=0;x<s.length();x++)
		{
			char z=s.charAt(x);
			int y=s.charAt(x);
			if(y>=65 && y<=90)
			{
				y+=32;
				z=(char)y;
				System.out.print(z);
			}
			else if(y>=97 && y<=122)
			{
				y-=32;
				z=(char)y;
				System.out.print(z);
			}
			else if(y==32)
				System.out.print(" ");
		}
	}
}