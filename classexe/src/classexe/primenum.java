package classexe;

public class primenum {

	public static void main(String[] args) {
		int num=367,count=0;
		int start=num;
		while(start>=1) {
			if(num%start==0) {
				count++;
			}
			start--;
		}
		if(count==2) {
			System.out.println(num+"  Prime number");
		}
		else {
			System.out.println(num+ "  Not a prime number");
		}
		System.out.println(count+"  factors");
		// TODO Auto-generated method stub

	}

}
