package chapter4;

public class E {

	public static void main(String[] args) {
		int a[]=new int[] {10,20,30,40,50,60,70,80,90,100};
		int element=67,x,index=5;
		for(x=a.length-1;x>index;x--)
		{
			a[x]=a[x-1];
		}
		a[x]=element;
		for(int temp1:a)
			System.out.print(temp1+" ");
	}

}
