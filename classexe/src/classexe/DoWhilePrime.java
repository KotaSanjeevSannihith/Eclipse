package classexe;

import java.util.Scanner;

public class DoWhilePrime {

	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		Primeornot p=new Primeornot();
		String s;
		do 
		{
			System.out.print("Yes/No : ");
			s=sc.next();
			if(s.equals("Yes"))
			{
				System.out.print("Enter a number : ");
				int x=sc.nextInt();
				p.isPrime(x);
			}
			else if(!s.equals("Yes")&&!s.equals("No"))
			{
				System.out.println("Enter a valid input");
			}
			else
			{
				System.out.println("Thank you");
			}
		}while(!s.equals("No"));
		//System.out.println("Thank you");
	}
}
class Primeornot
{
	void isPrime(int x)
	{
		int i,count=0;
		for(i=2;i<=x/2;i++)
		{
			if(x%i==0)
			{
				count++;
				break;
			}
		}
		System.out.println(count>0?"Not a prime":"Prime");
	}
}