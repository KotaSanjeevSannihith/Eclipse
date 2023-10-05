
public class swap {

	public static void main(String[] args) {
		int arr[]=new int[] {12,56,34,23,67,76,32,75,90,345};
		System.out.println();
		for(int x=0;x<arr.length;x+=2)
		{
			int temp=0;
			temp=arr[x];
			arr[x]=arr[x+1];
			arr[x+1]=temp;
		}
		for(int x=0;x<arr.length;x++)
		{
			System.out.print(arr[x]+"  ");
		}

	}

}
