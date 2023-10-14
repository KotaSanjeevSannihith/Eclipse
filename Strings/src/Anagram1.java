import java.util.Arrays;

public class Anagram1 
{
	public static void main(String[] args) 
	{
		String s1=new String("silent");
		String s2=new String("lisen");
		char a[]=s1.toCharArray();
		char b[]=s2.toCharArray();
		Arrays.sort(a);
		Arrays.sort(b);
		if(a.length==b.length)
		{
			System.out.println(Arrays.equals(a, b)?"Anagram":"Not an Anagram");
		}
		else
			System.out.println("Not an Anagram");
	}

}
