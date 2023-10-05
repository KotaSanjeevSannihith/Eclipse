public class nine 
{
	public static void main(String[] args) 
	{
		Oddeven oe=new Oddeven();
		int array[]=new int[] {15,27,11,10,33,37,47,44};
		oe.oddIndex(array);
		oe.evenIndex(array);
		oe.calArray(array);
	}
}
class Oddeven
{
	public void oddIndex(int arr[])
	{
		for(int x=1;x<arr.length;x+=2)
		{
			int temp=0;
			for(int y=1;y<arr.length;y+=2)
			{
				if(arr[x]<arr[y])
				{
					temp=arr[x];
					arr[x]=arr[y];
					arr[y]=temp;
				}
			}
		}
	}
	public void evenIndex(int arr1[])
	{
		for(int x=0;x<arr1.length;x+=2)
		{
			for(int y=0;y<arr1.length;y+=2)
			{
				int temp=0;
				if(arr1[x]>arr1[y])
				{
					temp=arr1[x];
					arr1[x]=arr1[y];
					arr1[y]=temp;
				}
			}
		}
	}
	public void calArray(int arr2[])
	{
		for(int x=0;x<arr2.length;x++)
		{
			System.out.print(arr2[x]+"  ");
		}
	}
}