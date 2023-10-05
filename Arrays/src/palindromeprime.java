public class palindromeprime {
	public static void main(String[] args) {
		int arr[]=new int[] {212,221,121,313,353,11,7,91};
		int pal=0,count=0,rem=0;
		for(int x=0;x<arr.length;x++)
		{
			pal=0;
			for(int y=arr[x];y!=0;y/=10)
			{
				rem=y%10;
				pal=pal*10+rem;
			}
			if(pal==arr[x])
			{
				for(int k=2;k<=arr[x]/2;k++)
				{
					count=0;
					if(arr[x]%k==0)
					{
						count++;
						break;
					}
				}
				System.out.println(count==0?arr[x]+" is Palindromic Prime":arr[x]+" is Palindrome but not Prime");
			}
			else
				System.out.println(arr[x]+" is Not a palindrome");
		}
	}

}