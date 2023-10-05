package chapter4;

import java.util.Arrays;

public class Sorting {

	public static void main(String[] args) {
		int a[]=new int[] {11,34,22,65,77,154,102,42,7,54};
		Sorting.isArr(a);
	}
	static void isArr(int a[])
	{
		Arrays.sort(a);
		for(int temp:a)
			System.out.print(temp+"  ");
	}

}
