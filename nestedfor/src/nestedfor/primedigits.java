package nestedfor;

public class primedigits {
	public static void main(String args[]) {
		int num=7597,rem=0,x;
		for(x=num;x!=0;x/=10) {
			rem=x%10;
			int y=2,count=0;
			for(;y<=rem/2;y++) {
				if(rem%y==0) {
					count++;
					break;
				}
			}
			if(count==0) {
				System.out.println(rem);
			}
			
		}
		
	}
}
