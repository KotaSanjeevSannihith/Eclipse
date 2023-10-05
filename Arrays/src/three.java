
public class three {

	public static void main(String[] args) {
		int arr[]=new int[] {12,56,34,23,67,76,32,75,90,345};
		System.out.print("Even Index numbers");
		System.out.println();
		for(int x=0;x<arr.length;x++)
		{
			if(x%2==0)
			{	
				System.out.print(arr[x]+"  ");
			}
		}
		System.out.println();
		System.out.print("Odd Index numbers");
		System.out.println();
		for(int x=0;x<arr.length;x++)
		{
			if(x%2!=0)
			{	
				System.out.print(arr[x]+"  ");
			}
		}
	}

}
