import java.util.Scanner;
public class palindrome {

	public static void main(String[] args) {
		Scanner k=new Scanner(System.in);
		System.out.println("Enter a number");
		int n=k.nextInt();
		int temp=n,rem=0,m=0;
		for(;n!=0;n/=10) {
			rem=n%10;
			m=m*10+rem;
		}
		n=temp;
		System.out.println(n==m?"Palindrome":"not a palindrome");
	}

}
