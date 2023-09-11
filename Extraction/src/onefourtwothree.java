
public class onefourtwothree {

	public static void main(String[] args) 
	{
		int rem=0,num=7423,count=0,a=1,b=1;
		for(;num!=0;num/=10) {
			rem=num%10;
			count++;
			if(count==4 || count==1) {
				a=a*rem;
			}
			else {
				b=b*rem;
			}
		}
		System.out.println(a+b);
	}

}
