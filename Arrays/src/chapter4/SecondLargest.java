package chapter4;

import java.util.Arrays;

public class SecondLargest {

	public static void main(String[] args) {
		int a[]=new int[] {8,17,11,12,21,16,14,13,3,4,21,21,21,21};
		Arrays.sort(a);
		for(int i=a.length-2;i>=0;i--)
		{
			if(a[a.length-1]!=a[i])
			{
				System.out.println("Second largest element is "+a[i]);
				break;
			}
		}
	}

}
