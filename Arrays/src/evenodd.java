public class evenodd 
{
	public static void main(String[] args) 
	{
		int arr[]=new int[] {15,23,35,22,31,45,54};
		int sum=0,mul=1,count=0;
		for(int x=0;x<arr.length;x++)
		{
			if(x%2==0)
				sum+=arr[x];
			else
				mul*=arr[x];
		}
		System.out.println(sum+"  "+mul);
		for(int x=2;x<=sum/2;x++)
		{
			if(sum%x==0) 
			{
				count++;
				break;
			}			
		}
		System.out.println(count==0?sum+" is a Prime number":sum+" is not a prime");
		int temp=0,rem=0,arm=0;
		for(int x=mul;x!=0;x/=10)
		{
			temp++;
		}
		for(int x=mul;x!=0;x/=10)
		{
			rem=x%10;
			arm=arm+(int)Math.pow(rem,temp);
		}
		System.out.println(mul==arm?"Armstrong":"Not Armstrong");
	}

}
