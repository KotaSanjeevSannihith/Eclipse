package nestedfor;

public class alienrange {

	public static void main(String[] args) {
		int x,num,rnum=0,rem1=0,rem2=0,temp=0;
		for(x=1;x<1000;x++) {
			int sq=(int)(Math.pow(x,2));
			temp=0;
			rnum=0;
			for(num=x;num!=0;num/=10)
			{
				rem1=num%10;
				rnum=rnum*10+rem1;
			}
		
			int rsq=(int)(Math.pow(rnum,2));
			for(;rsq!=0;rsq/=10){
				rem2=rsq%10;
				temp=temp*10+rem2;
			}
			if(temp==sq) {
				System.out.println(x);
			}
		}	
	}

}
