
public class sumfor {

	public static void main(String[] args) {
		int num,rem=0,sum=0,mul=1,count=0;
		for(num=13579;num!=0;num/=10) {
			rem=num%10;
			sum+=rem;
			mul*=rem;
			count++;
			System.out.println(rem);
		}
		System.out.println("sum is = "+sum);
		System.out.println("product is = "+mul);
		System.out.println("no. of times loop iterated = "+count);
	}
}
