public class duplicate {

	public static void main(String[] args) {
		int arr[]=new int[] {10,20,10,30,40,20,40,50,70,30};
		for(int x=0;x<arr.length;x++) 
		{
			for(int y=0;y<arr.length;y++)
			{
				if(x!=y && arr[x]==arr[y]) 
				{
					arr[x]=0;
				}
			}
		}
		for(int x=0;x<arr.length;x++)
		{
			System.out.print(arr[x]+"  ");
		}
	}

}
