public class ascending {
	public static void main(String[] args) {
		int arr[]=new int[] {10,30,20,50,70,90,1,40,70};
		Order o=new Order();
		o.descendingOrder(arr);
		o.ascendingOrder(arr);
	}
}
class Order
{
	public void descendingOrder(int k[])
	{
		for(int x=0;x<k.length;x++)
		{
			for(int y=0;y<k.length;y++)
			{
				int temp=0;
				if(k[x]>k[y])
				{
					temp=k[y];
					k[y]=k[x];
					k[x]=temp;
				}
			}
		}
		System.out.println("Descending order is :- ");
		for(int l=0;l<k.length;l++)
		{
			System.out.print(k[l]+"   ");
		}
		System.out.println();
	}
	public void ascendingOrder(int r[])
	{
		for(int x=0;x<r.length;x++)
		{
			for(int y=0;y<r.length;y++)
			{
				int temp=0;
				if(r[x]<r[y])
				{
					temp=r[y];
					r[y]=r[x];
					r[x]=temp;
				}
			}
		}
		System.out.println("Ascending order is :- ");
		for(int l=0;l<r.length;l++)
		{
			System.out.print(r[l]+"   ");
		}
		System.out.println();
	}
}