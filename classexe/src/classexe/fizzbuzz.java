package classexe;

public class fizzbuzz {
	
	public static void main(String args[]) {
		
		int num=28;
		if(num%5==0) {
			if(num%3==0) {
				System.out.println("fizzbuzz");
			}
			else {
				System.out.println("buzz");
			}
		}
		else if(num%3==0) {
			if(num%5!=0) {
				System.out.println("fizz");
			}
		}
		else {
			System.out.println(num);
		}
	}

}
