package classexe;

public class forfactors 
{

	public static void main(String[] args) 
	{
		
		int x,num=19,count=0;
		for(x=1;x<=num/2 && count<=2;x++) 
		{
			if(num%x==0) 
			{
				count++;
				System.out.println(x);
			}
			
		}
		if(count>=2) 
		{
			System.out.println("Composite Number");
		}
		else 
		{
			System.out.println("Prime number");
		}
		

	}

}
