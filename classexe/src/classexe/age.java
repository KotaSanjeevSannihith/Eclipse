package classexe;

public class age {

	public static void main(String[] args) {
		int age=60;
		if(age<18) {
			System.out.println("minor");
		}
		if(age>18) {
			if(age<50) {
				System.out.println("major");
			}
			else {
				System.out.println("senior citizen");
			}
		}

	}

}