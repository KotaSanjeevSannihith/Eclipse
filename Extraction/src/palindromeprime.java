import java.util.Scanner;
public class palindromeprime {

	public static void main(String[] args) {
		Scanner k=new Scanner(System.in);
		System.out.println("Enter a number");
		int n=k.nextInt();
		int rem=0,temp=0,pal=n,i,factor=0;
		for(;n!=0;n/=10) 
		{
			rem=n%10;
			temp=temp*10+rem;
		}
		n=pal;
		if(n==temp) 
		{
			for(i=2;i<=n/2;i++) 
			{
				if(n%i==0) 
				{
					factor++;
					break;
				}
			}
				if(factor>0) 
				{
					System.out.println("Palindrome not Prime");
				}
				else 
				{
					System.out.println("Palindeome and Prime");
				}
				
		}
		else
			System.out.println("Not a palindrome");
	}

}
