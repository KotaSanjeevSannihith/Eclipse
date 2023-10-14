package chapter4;

public class BubbleSort {

	public static void main(String[] args) {
		int a[]=new int[] {8,17,11,12,21,16,14,13,3,4};
		int x,y,temp=0;
		for(x=0;x<a.length;x++)
		{
			for(y=1;y<a.length;y++)
			{
				if(a[y-1]>a[y])
				{
					temp=a[y-1];
					a[y-1]=a[y];
					a[y]=temp;
				}
			}
		}
		for(int temp1:a)
		{
			System.out.print(temp1+" ");
		}
	}

}
