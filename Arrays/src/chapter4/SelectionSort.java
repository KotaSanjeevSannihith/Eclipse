package chapter4;

public class SelectionSort {

	public static void main(String[] args)
	{
		int a[]=new int[] {8,17,11,12,21,16,14,13,3,4};
		int x,y,min=0,temp=0;
		for(x=0;x<a.length;x++)
		{
			min=x;
			for(y=x+1;y<a.length;y++)
			{
				if(a[min]>a[y])
				{
					min=y;
				}
			}
			temp=a[min];
			a[min]=a[x];
			a[x]=temp;
		}
		for(int temp1:a)
			System.out.print(temp1+"  ");
	}

}
