package chapter4;

public class SingleloopSort {

	public static void main(String[] args) {
		int a[]=new int[] {8,17,11,12,21,16,14,13,3,4};
		for(int i=0;i<a.length-1;i++)
		{
			int temp=0;
			if(a[i]>a[i+1])
			{
				temp=a[i];
				a[i]=a[i+1];
				a[i+1]=temp;
				i=-1;
			}
		}
		for(int temp1:a)
		{
			System.out.print(temp1+"  ");
		}
	}

}
