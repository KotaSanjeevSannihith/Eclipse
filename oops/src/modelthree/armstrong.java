package modelthree;

public class armstrong {

	public static void main(String[] args) {
		int num=153,arm=0,rem=0,count=0;
		for(int x=num;x!=0;x/=10)
		{
			rem=x%10;
			count++;
		}
		for(int x=num;x!=0;x/=10) 
		{
			rem=x%10;
			arm=arm+(int)Math.pow(rem,count);
		}
		System.out.println(arm==num?"Armstrong":"Not Armstrong");
	}

}
