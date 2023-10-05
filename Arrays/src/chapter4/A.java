package chapter4;

public class A {

	public static void main(String[] args) {
		int a[]=new int[] {10,20,30,40,50,60,70,80,90,100};
		int rot=5;
		for(int y=1;y<=rot;y++)
		{
			int x,temp=a[a.length-1];
			for(x=a.length-1;x>0;x--)
			{
				a[x]=a[x-1];
			}
			a[x]=temp;
		}
		for(int temp1:a)
			System.out.print(temp1+" ");

	}

}
