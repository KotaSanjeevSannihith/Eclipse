package chapter4;

public class TraditionalSort {

	public static void main(String[] args) {
		int a[]=new int[] {8,17,11,12,21,16,14,13,3,4};
		int x,y;
		for(x=0;x<a.length;x++)
		{
			int temp=0;
			for(y=x+1;y<a.length;y++)
			{
				if(a[x]>a[y])
				{
					temp=a[x];
					a[x]=a[y];
					a[y]=temp;
				}
			}
		}
		for(int temp1:a)
			System.out.print(temp1+"  ");
	}

}
