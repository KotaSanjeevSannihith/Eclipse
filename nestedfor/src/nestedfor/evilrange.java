package nestedfor;

public class evilrange {

	public static void main(String[] args) {
		int num,rem=0,sum=0;
		for(num=1;num<=10000;num++) {
			int temp=num;
			int sq=(int)(Math.pow(num,2));
			sum=0;
			for(;sq!=0;sq/=10)
			{
				rem=sq%10;
				sum+=rem;
			}
			num=temp;
			if(sum==num)
			System.out.println(num);
		}

	}

}
