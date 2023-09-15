package nestedfor;

public class palindromeprime {

	public static void main(String[] args) {
		int x;
		for(x=1;x<10000;x++) {
			int y,rem=0,rev=0,temp=x;
			for(y=x;y!=0;y/=10) {
				rem=y%10;
				rev=rev*10+rem;
			}
			if(temp==rev) {
				int i=2,count=0;
				for(;i<=rev/2;i++) {
					if(rev%i==0) {
						count++;
						break;
					}
				}
				rev=temp;
				if(count==0) {
					System.out.println(rev);
				}
			}
		}
		
	}

}
