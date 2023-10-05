public class eight {
	public static void main(String[] args) {
		int a[]=new int[] {50,40,70,90,100,170,130,120};
		Ascension AA=new Ascension();
		AA.splitOrder(a);
	}
}
class Ascension
{
	public void splitOrder(int arr[])
	{
		int one[]=new int[(arr.length)/2];
		int two[]=new int[(arr.length)/2];
		System.out.println("First Array is Ascending order: ");
		for(int k=0;k<=(arr.length-1)/2;k++)
		{
			one[k]=arr[k];
		}
		for(int k=0;k<one.length;k++)
		{
			for(int i=0;i<one.length;i++)
			{
				int temp=0;
				if(one[k]<one[i])
				{
					temp=one[k];
					one[k]=one[i];
					one[i]=temp;
				}
			}
		}
		for(int k=0;k<one.length;k++)
		{
			System.out.print(one[k]+"  ");
		}
		int count=0;
		System.out.println();
		System.out.println("Second Array in descending order is: ");
		for(int k=((arr.length-1)/2)+1;k<arr.length;k++)
		{
			two[count]=arr[k];
			count++;
		}
		for(int k=0;k<two.length;k++)
		{
			for(int i=0;i<two.length;i++)
			{
				int temp=0;
				if(two[k]>two[i])
				{
					temp=two[k];
					two[k]=two[i];
					two[i]=temp;
				}
			}
		}
		for(int k=0;k<two.length;k++)
		{
			System.out.print(two[k]+"  ");
		}
	}
}