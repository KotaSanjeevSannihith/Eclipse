package chapter4;

public class F {

	public static void main(String[] args) {
		int a[]=new int[] {10,20,30,40,50,60,70,80,90,100};
		int index=0,element=40,x;
		for(x=0;x<a.length;x++)
		{
			if(a[x]==element)
			{	
				index=x;
				break;
			}
		}
		for(x=index;x<a.length-1;x++)
		{
			a[x]=a[x+1];
		}
		for(int temp:a)
			System.out.print(temp+"  ");
	}

}
