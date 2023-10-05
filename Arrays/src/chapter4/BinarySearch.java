package chapter4;

import java.util.Arrays;

public class BinarySearch 
{
	public static void main(String[] args) 
	{
		int a[]=new int[] {11,34,22,65,77,154,102,42,7,54};
		int search=12,enable=0;
		Arrays.sort(a);
		int low=0,high=a.length-1,mid;
		while(low<=high)
		{
			mid=(low+high)/2;
			if(a[mid]<search)
			{
				low=mid+1;
			}
			else if(a[mid]>search)
			{
				high=mid-1;
			}
			else
			{
				enable=1;
				break;
			}
			
		}
		System.out.println(enable==1?"Found":"Not found");
	}

}
