public class MaxVowels 
{
	public static void main(String[] args) 
	{
		String s1="happy new year";
		int count=0,maxcount=0,index=0;
		String s2[]=s1.split(" ");
		for(int x=0;x<s2.length;x++)
		{
			count=0;
			for(int y=0;y<s2[x].length();y++)
			{
				char car=s2[x].charAt(y);
				if(car=='a' || car=='e' || car=='i' || car=='o' || car=='u' || car=='A' ||car=='E'||car=='I'||car=='O'||car=='U')
				{
					count++;
				}
			}
			if(count>maxcount)
			{
				maxcount=count;
				index=x;
			}
		}
		System.out.println(s2[index]);
	}

}
