package homework;

public class Divisiors {
	public static void main(String[] args) 
	{
	    int num=4,sum=0;
	    for(int x=1;x<=num;x++)
	    {
	        for(int y=1;y<=x;y++)
	        {
	            if(x%y==0)
	            {
	                sum=sum+y;
	            }
	        }
	    }
		System.out.println(sum);
	}
}