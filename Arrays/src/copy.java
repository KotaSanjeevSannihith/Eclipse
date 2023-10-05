
public class copy {

	public static void main(String[] args) {
		int arr[]=new int[] {10,20,30,40,50,60};
		int arr1[]=new int[arr.length/2];
		int arr2[]=new int[arr.length/2];
		for(int x=0;x<=(arr.length-1)/2;x++)
		{
			arr1[x]=arr[x];
		}
		for(int y=0,x=(arr.length)/2;x<arr.length;x++,y++)
		{
			arr2[y]=arr[x];
		}
		System.out.println("Array Arr1");
		for(int x=0;x<arr1.length;x++)
		{
			System.out.print(arr1[x]+"   ");
		}
		System.out.println();
		System.out.println("Array Arr2");
		for(int x=0;x<arr2.length;x++)
		{
			System.out.print(arr2[x]+"  ");
		}
	}

}
