package classexe;

public class operators {
	public static void main(String args[]){
		double a=50.0,b=40.0;
		char k='+';
		if((int)(k)==43) {
			System.out.println("Addition "+(a+b));
		}
		if((int)(k)==47) {
			System.out.println("Division "+(a/b));
		}
		if((int)(k)==45) {
			System.out.println("Subtraction "+(a-b));
		}
		if((int)(k)==42) {
			System.out.println("Multiplication "+a*b);
		}
		if((int)(k)==37) {
			System.out.println("Modulus "+a%b);
		}
	}

}
