package classexe;

public class forinfinite 
{
	public static void main(String args[]) 
	{
		int x=49,count=0,num,l=0;
		for(num=2;num<=x/2;num++) {
			if(x%num==0) {
				count++;
				break;
			}
			l++;
		}
		System.out.println(l);
		if(count==0) {
			System.out.println("Prime");
		}
		else {
			System.out.println("Composite");
		}
		
	}
}
