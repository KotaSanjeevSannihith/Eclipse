package chapter4;

public class Secondmax {

	public static void main(String[] args) {
		int a[]=new int[] {8,17,11,12,21,16,14,13,3,4,21,21,21,21};
		int f=Integer.MIN_VALUE;
		int s=Integer.MIN_VALUE;
		for(int x=0;x<a.length;x++)
		{
			if(a[x]<f && a[x]>s)
			{
				s=a[x];
			}
			else if(a[x]>f)
			{
				s=f;
				f=a[x];
			}
		}
		System.out.println(s);
	}

}
