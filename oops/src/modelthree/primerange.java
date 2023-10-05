package modelthree;

public class primerange {

	public static void main(String[] args) {
		
	}
}

class Prime
{
	public void checkPrime(int num)
	{
		int count=0;
		for(int x=2;x<=num/2;x++)
		{
			if(num%x==0)
			{
				count++;
				break;
			}
		}
	}
}