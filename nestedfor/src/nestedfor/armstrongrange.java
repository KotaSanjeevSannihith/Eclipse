package nestedfor;

public class armstrongrange {

	public static void main(String[] args) {
		int num;
		for(num=1;num<1000;num++)
		{
			int arm=0,rem=0,x,count=0;
			x=num;
			for(;x!=0;x/=10)
			{
				count++;
			}
			x=num;
			for(;x!=0;x/=10)
			{
				rem=x%10;
				arm=arm+(int)(Math.pow(rem,count));
			}
			x=num;
			if(arm==x) {
				System.out.println(x);
			}
		}

	}

}
