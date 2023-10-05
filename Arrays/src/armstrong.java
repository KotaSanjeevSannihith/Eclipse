
public class armstrong 
{
	public static void main(String[] args) 
	{
		Armarm arm=new Armarm();
		arm.isArm1();
		int arr[]=new int[] {10,5,21,153,258,1,9,15};
		arm.isArr2(arr);
		int result=arm.isArr3();
		System.out.println("Number of Armstrong number in the array are "+result);
	}
}
class Armarm
{
	public void isArm1()
	{
		System.out.println("Model 1");
		int arr[]=new int[] {10,5,21,153,258,1,9,15};
		for(int y=0;y<arr.length;y++)
		{
			int rem=0,count=0,arm=0;
			for(int x=arr[y];x!=0;x/=10)
			{
				rem=x%10;
				count++;
			}
			rem=0;
			for(int x=arr[y];x!=0;x/=10)
			{
				rem=x%10;
				arm=arm+(int)(Math.pow(rem, count));
			}
			System.out.println(arr[y]==arm?"Armstrong":"not Armstrong");
		}
		System.out.println();
	}
	public void isArr2(int arr2[])
	{
		System.out.println("Model 3");
		for(int y=0;y<arr2.length;y++)
		{
			int rem=0,count=0,arm=0;
			for(int x=arr2[y];x!=0;x/=10)
			{
				rem=x%10;
				count++;
			}
			rem=0;
			for(int x=arr2[y];x!=0;x/=10)
			{
				rem=x%10;
				arm=arm+(int)Math.pow(rem,count);
			}
			System.out.println(arm==arr2[y]?"Armstrong":"Not Armstrong");
		}
		System.out.println();
	}
	public int isArr3()
	{
		System.out.println("Model 2");
		int arr3[]=new int[] {10,5,21,153,258,1,9,15};
		int count2=0;
		for(int y=0;y<arr3.length;y++) 
		{
			int rem=0,count=0,arm=0;
			for(int x=arr3[y];x!=0;x/=10)
			{
				rem=x%10;
				count++;
			}
			for(int x=arr3[y];x!=0;x/=10)
			{
				rem=x%10;
				arm=arm+(int)Math.pow(rem,count);
			}
			if(arr3[y]==arm)
				count2++;
		}
		return count2;
	}
}