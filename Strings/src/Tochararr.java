public class Tochararr 
{
	public static void main(String[] args) 
	{
		String s="Hello there!";
		char [] a=s.toCharArray();
		char temp;
		for(int x=0;x<a.length;x++)
		{
			for(int y=x+1;y<a.length;y++)
			{
				if(a[x]>a[y])
				{
					temp=a[x];
					a[x]=a[y];
					a[y]=temp;
				}
			}
		}
		boolean bol[]=new boolean[a.length];
		int count=1;
		for(int x=0;x<a.length;x++)
		{
			count=1;
			if(bol[x]==true)
			{
				continue;
			}
			for(int y=x+1;y<a.length;y++)
			{
				if(a[x]==a[y])
				{
					bol[y]=true;
					count++;
				}
			}
			//if(count==1)
			{
				System.out.println(a[x]+" repeated "+count+" times");
			}
		}
	}

}
