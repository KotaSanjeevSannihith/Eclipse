import java.util.*;
public class Anagram {

	public static void main(String[] args) {
		String s1="ate";
		String s2="Mahesh";
		char a[]=s1.toCharArray();
		char b[]=s2.toCharArray();
		Arrays.sort(a);
		Arrays.sort(b);
		if(a.length==b.length)
		{
			if(Arrays.equals(a,b))
				System.out.println("Anagram");
			else
				System.out.println("Not an anagram");
		}
		else
			System.out.println("Not an anagram");
	}

}
