
public class two {

	public static void main(String[] args) {
		int arr[]=new int[] {12,56,34,23,67,76,32,75,90,345};
		for(int x=arr.length-1;x>=0;x--)
		{
			System.out.print(arr[x]+"  ");
		}
		System.out.println();
		
		for(int y=(arr.length/2)-1;y>=0;y--)
		{
			System.out.print(arr[y]+"  ");
		}
		System.out.println();
		for(int k=arr.length-1;k>arr.length/2-1;k--)
		{
			System.out.print(arr[k]+"  ");
		}
	}

}
