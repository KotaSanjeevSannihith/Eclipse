package modelthree;

public class armtwo {

	public static void main(String[] args) {
		Twoarm arm=new Twoarm();
		int x=arm.forArm();
		System.out.println(x>0?"Armstrong":"Not Armstrong");
	}
}
class Twoarm
{
	public int forArm()
	{
		int temp=0;
		int num=22,rem=0,arm=0,count=0;
		for(int x=num;x!=0;x/=10)
		{
			rem=x%10;
			count++;
		}
		for(int x=num;x!=0;x/=10)
		{
			rem=x%10;
			arm=arm+(int)Math.pow(rem, count);
		}
		if(arm==num)
			temp++;
		return temp;
	}
}