
public class amstrong {

	public static void main(String[] args) {
		int n=9,count=0,rem=0,arm=0,temp=n;
		for(;n!=0;n/=10) {
			count++;
		}
		n=temp;
		for(;n!=0;n/=10){
			rem=n%10;
			arm=arm+(int)(Math.pow(rem, count));
		}
		n=temp;
		System.out.println((arm==n)?"Armstrong":"not amstrong");
	}

}
