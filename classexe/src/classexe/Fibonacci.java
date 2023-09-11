package classexe;

public class Fibonacci {

	public static void main(String[] args) {
		int first=0,second=1,third,count,x=0;
		System.out.println(first);
		System.out.println(second);
		for(count=13;count>=x;x++) {
			third=second+first;
			first=second;
			second=third;
			//System.out.println(first+"  "+second);
			System.out.println(third);
		}
	}

}
