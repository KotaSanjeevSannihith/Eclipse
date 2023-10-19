package classexe;
import java.util.*;
public class DoWhile 
{
	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter a number :  ");
		int x=sc.nextInt();
		String s="Y";
		int i,count=0;
		while(s.equals("Y")) 
		{
			count=0;
			for(i=2;i<=x/2;i++)
			{
				if(x%i==0)
				{
					count++;
					break;
				}
			}
			System.out.println(count>0?"Not a Prime":"Prime");
			System.out.print("Y/N :  ");
			s=sc.next();
			if(s.equals("N"))
			{
				System.out.println("Thank you");
				break;
			}
			else if(!s.equals("Y")&&!s.equals("N"))
			{
				System.out.println("Invalid input");
			}
			System.out.println();
			System.out.print("Enter the next number :  ");
			x=sc.nextInt();
		}
	}
}
/*
 do {
			count=0;
			i=2;
			if(x%i==0)
			{
				count++;
				break;
			}
			if(count!=0)
				System.out.println("Not a prime");
			else
				System.out.println("Prime");
			//System.out.println(count>0?"Not a prime":"Prime");
		}while(i<=x/2 && s=="Y");
*/