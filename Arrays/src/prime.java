public class prime
{
	public static void main(String[] args) 
	{
		int arr[]=new int[] {15,23,31,42,53,67,70,18,29,10};
		for(int x=0;x<arr.length;x++)
		{
			int temp=0;
			for(int y=2;y<=arr[x]/2;y++) {
				if(arr[x]%y==0)
				{
					temp++;
					break;
				}
			}
			if(temp==0)
			{
				System.out.println(arr[x]);
			}
		}	
	}
}
