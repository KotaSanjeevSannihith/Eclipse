package chapter4;
import java.util.Arrays;
public class Everything 
{
	public static void main(String[] args) 
	{
		int a[]=new int[] {8,17,11,12,21,16,14,13,3,4};
		Operations op=new Operations();
		String input="Bubble Sort";
		switch(input)
		{
		case "Linear Search":
			op.searchLinear(a, 16);
			break;
		case "Binary Search":
			op.searchBinary(a, 13);
			break;
		case "Largest Element":
			op.elementLargest(a);
			break;
		case "Smallest Element":
			op.elementSmallest(a);
			break;
		case "Traditional Sort":
			op.sortTraditional(a);
			break;
		case "Selection Sort":
			op.sortSelection(a);
			break;
		case "Bubble Sort":
			op.sortBubble(a);
		}
		
	}
}
class Operations
{
	void elementLargest(int a[])
	{
		int lar=0;
		for(int x=0;x<a.length;x++)
		{
			if(a[lar]<a[x])
				lar=x;
		}
		System.out.println("Largest element in the array is "+a[lar]);
	}
	void  elementSmallest(int a[])
	{
		int small=0;
		for(int x=0;x<a.length;x++)
		{
			if(a[small]>a[x])
			{
				small=x;
			}
		}
		System.out.println("Smallest element in the array is "+a[small]);
	}
	void sortTraditional(int a[])
	{
		int x,y,temp=0;
		for(x=0;x<a.length;x++)
		{
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
		System.out.println("Traditional Sort");
		for(int temp1:a)
			System.out.print(temp1+"  ");
		System.out.println();
	}
	void sortSelection(int a[])
	{
		int x,y,min=0,temp=0;
		for(x=0;x<a.length;x++)
		{
			min=x;
			for(y=x+1;y<a.length;y++)
			{
				if(a[min]>a[y])
				{
					min=y;
				}
			}
			temp=a[min];
			a[min]=a[x];
			a[x]=temp;
		}
		System.out.println("Selection Sort");
		for(int temp1:a)
			System.out.print(temp1+"  ");
		System.out.println();
	}
	void searchLinear(int a[],int ele)
	{
		int x,enable=0;
		for(x=0;x<a.length;x++)
		{
			if(ele==a[x])
			{
				enable=1;
				break;
			}
		}
		System.out.println(enable==1?"Element found at index "+x:"Element not found");
	}
	void searchBinary(int a[],int ele)
	{
		Arrays.sort(a);
		int enable=0;
		int min=0,max=a.length-1,mid;
		while(min<=max)
		{
			mid=(min+max)/2;
			if(a[mid]<ele)
			{
				min=mid+1;
			}
			else if(a[mid]>ele)
			{
				max=mid-1;
			}
			else
			{
				enable=1;
				break;
			}
		}

		System.out.println(enable==1?"Element found":"Element not found");
	}
	void sortBubble(int a[])
	{
		int temp=0;
		for(int i=0;i<a.length;i++)
		{
			for(int j=1;j<a.length;j++)
			{
				if(a[j-1]>a[j])
				{
					temp=a[j-1];
					a[j-1]=a[j];
					a[j]=temp;
				}
			}
		}
		for(int temp1:a)
			System.out.print(temp1+"  ");
	}
}