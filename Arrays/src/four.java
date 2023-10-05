
public class four {

	public static void main(String[] args) {
		int arr[]=new int[] {12,56,34,23,67,76,32,75,90,345};
		System.out.print("divisible by 4");
		System.out.println();
		for(int x=0;x<arr.length;x++)
		{
			if(arr[x]%4==0)
			{	
				System.out.print(arr[x]+"  ");
			}
		}
		System.out.println();
		System.out.print("divisible by 3");
		System.out.println();
		for(int x=0;x<arr.length;x++)
		{
			if(arr[x]%3==0)
			{	
				System.out.print(arr[x]+"  ");
			}
		}

	}

}
