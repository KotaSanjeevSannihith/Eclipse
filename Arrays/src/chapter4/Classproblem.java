package chapter4;

public class Classproblem {

	public static void main(String[] args) {
		int a[]=new int[] {5,2,-5,6,7,-2,-6};
		int temp=0;
		for(int x=0;x<a.length;x++)
		{
			if(a[x]<0)
			{
				for(int y=x;y>0;y--)
				{
					temp=a[y];
					a[y]=a[y-1];
					a[y-1]=temp;
				}
			}
		}
		for(int temp1:a)
			System.out.print(temp1+" ");
	}

}
