
public class roman {

	public static void main(String[] args) {
		int num=150001,rem=0,x,rev=0,count=0;
		for(x=num;x!=0;x/=10)
		{
			rem=x%10;
			rev=rev*10+rem;
			if(rev==0) 
			{
				count++;
			}
		}
		for(x=rev;x!=0;x/=10) {
			rem=x%10;
			switch(rem) {
				case 0:
				System.out.print("zero ");
				break;
				case 1:
					System.out.print("one ");
				break;
				case 2:
					System.out.print("two ");
					break;
				case 3:
					System.out.print("three ");
					break;
				case 4:
					System.out.print("four ");
					break;
				case 5:
					System.out.print("five ");
					break;
				case 6:
					System.out.print("six ");
					break;
				case 7:
					System.out.print("seven ");
					break;
				case 8:
					System.out.print("eight ");
					break;
				case 9:
					System.out.print("nine ");
					break;
			
			}
		}
		for(;count>0;count--) {
			System.out.print("zero ");
		}

	}

}
