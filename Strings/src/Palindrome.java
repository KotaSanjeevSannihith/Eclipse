public class Palindrome 
{
	public static void main(String args[])
	{
		String s1="malayalam";
		StringBuilder sb=new StringBuilder(s1);
		String s=sb.reverse().toString();
		if(s1.compareTo(s)==0)
			System.out.println("P");
	}
}
