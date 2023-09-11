import java.util.Scanner;
public class oddsumevenmul {

	public static void main(String[] args) {
		Scanner k=new Scanner(System.in);
		System.out.println("Enter a Number");
		int n=k.nextInt();
		int rem=0,count=0,sum=0,mul=1;
		for(;n!=0;n/=10) {
			rem=n%10;
			
			if(count%2==0) {
				sum+=rem;
			}
			else {
				mul*=rem;
			}
			count++;
		}
		System.out.println("Addition "+sum);
		System.out.println("Product "+sum);

	}

}
