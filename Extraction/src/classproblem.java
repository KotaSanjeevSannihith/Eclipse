
public class classproblem {

	public static void main(String[] args) {
		int rev=0,rem=0,num=105000,count=0,temp;
		for(;num!=0;num/=10) {
			rem=num%10;
			rev=rev*10+rem;
			if(rev==0) {
				count++;
			}
		}
		temp=rev*(int)(Math.pow(10,count));
		System.out.println(temp);
	}

}
