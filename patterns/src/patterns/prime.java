package patterns;

public class prime {

	public static void main(String[] args) {
		int row=5,r,c,num=1,count;
		for(r=1;r<=row;r++) {
			for(c=1;c<=r;) 
			{
				
				count=0;
				for(int x=2;x<=num/2;x++)
				{
					if(num%x==0) {
						count++;
					}
				}
				if(count==0) {
					System.out.print(num+" ");
					c++;
				}
				num++;
			}
			System.out.println();
		}

	}

}
