package homework;

public class capitalsmall {

	public static void main(String[] args) {
		char letter='k';
		int k=(int)(letter);
		System.out.println(k);
		if(k>=65 && k<=90) {
			System.out.println("given character is uppercase");
		}
		if(k>=97 && k<=122){
			System.out.println("given character is lowercase");
		}
		else {
			System.out.println("given character is random");
		}
		// TODO Auto-generated method stub

	}

}
