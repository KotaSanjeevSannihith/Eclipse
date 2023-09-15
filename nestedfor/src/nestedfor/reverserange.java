package nestedfor;

public class reverserange {

	public static void main(String[] args) {
		int x;
		for(x=1;x<=100;x++)
		{
			int y,rem=0,count=0,rev=0,temp=0;
			for(y=x;y!=0;y/=10) {
				rem=y%10;
				rev=rev*10+rem;
				if(rev==0) {
					count++;
				}
			}
			temp=rev*(int)(Math.pow(10,count));
			System.out.println(temp);
		}

	}

}
