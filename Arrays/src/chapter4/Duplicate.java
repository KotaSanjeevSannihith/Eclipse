package chapter4;
public class Duplicate
{
	public static void main(String[] args) 
	{
		int count;
		int a[]=new int[] {8,17,11,12,21,16,14,13,3,4,11,14,11};
		boolean b[]=new boolean[a.length];
		for(int i=0;i<a.length-1;i++)
		{
			count=1;
			if(b[i]==true)
			{
				continue;
			}
			for(int j=i+1;j<a.length;j++)
			{
				if(a[i]==a[j])
				{
					b[j]=true;
					count++;
				}
			}
			System.out.println(a[i]+" repeated "+count+" times");
		}
	}
}