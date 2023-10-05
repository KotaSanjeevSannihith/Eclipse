package chapter4;
public class C
{
	public static void main(String[] args)
	{
		int a[]=new int[] {10,20,30,40,50,60,70,80,90,100};
		int rot=5;
		for(int y=1;y<=rot;y++)
		{
			int x,temp=a[0];
			for(x=0;x<a.length-1;x++)
			{
				a[x]=a[x+1];
			}
			a[x]=temp;
		}
		for(int temp1:a)
			System.out.print(temp1+" ");
	}

}
