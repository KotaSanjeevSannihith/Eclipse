package classexe;

public class factors {

	public static void main(String[] args) {
		int num=31,start=1,count=0;
		while(start<=num) {
			if(num%start==0) {
				count++;
			}
		start++;
		}
		System.out.println("No. of Factors: "+count);
		if(count>=5) {
			System.out.println("Super number");
		}
		else {
			System.out.println("Not a super number");
		}
		// TODO Auto-generated method stub

	}

}
