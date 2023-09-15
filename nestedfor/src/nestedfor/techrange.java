package nestedfor;

public class techrange {

	public static void main(String[] args) {
		int num,temp;
		for(num=1;num<100000;num++)
		{
			temp=num;
			int x=num,a=0,b=0;
			int count=0;
			for(;x!=0;x/=10)
			{
				count++;
			}
			x=temp;
			if(count%2==0)
			{
				a=temp%(int)(Math.pow(10,count/2));
				b=temp/(int)(Math.pow(10,count/2));
				if((int)(Math.pow(a+b, 2))==x) {
					System.out.println(x);
				}
			}
		}

	}

}
