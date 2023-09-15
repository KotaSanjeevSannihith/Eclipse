package nestedfor;

public class factorsrange {

	public static void main(String[] args) {
		int x;
		for(x=90;x<=100;x++) {
			int y=x,i=2,count=0;
			System.out.println("factors of "+y+"  ");
			for(;i<=y/2;i++) {
				if(y%i==0) {
					System.out.println(" ->  "+i);
					count++;
					
				}
				
			}
			if(count==0)
				System.out.println(" ->  none");
		}

	}

}
