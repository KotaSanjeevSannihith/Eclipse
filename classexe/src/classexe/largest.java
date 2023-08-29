package classexe;

public class largest {

	public static void main(String[] args) {
		
		int a=50,b=200,c=30;
		if(a>b) {
			if(a>c) {
				System.out.println(a+" is the largest number");
			}
			else {
				System.out.println(c+" is the largest number");
			}
		}
		else if(b>a) {
			if(b>c) {
				System.out.println(b+" is the largest number");
			}
			else {
				System.out.println(c+" is the greatest number");
			}
		}
		else {
			System.out.println(c+" is the largest number");
		}

	}

}
