package modelthree;

public class armthree {

	public static void main(String[] args) {
		Arm3 arm=new Arm3();
		int num=153;
		int y=arm.isArm(num);
		arm.checkArm(num,y);
	}

}
class Arm3
{
	int arm=0;
	public int isArm(int num)
	{
		int rem=0,count=0;
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
		return arm;
	}
	public void checkArm(int num,int arm)
	{
		System.out.println(arm==num?"Armstrong":"not Armstrong");
	}
}