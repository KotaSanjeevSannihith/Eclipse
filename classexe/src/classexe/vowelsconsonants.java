package classexe;

public class vowelsconsonants {

	public static void main(String[] args) {
		
		char temp='B';
		int k=(int)temp;
		if(k>=65 && k<=90) {
			System.out.println("Uppercase letter");
			System.out.println((k==65 || k==69 || k==73 || k==79 || k==85)?("Vowel"):("consonant"));
		}
		else if(k>=97 && k<=122) {
			System.out.println("Lowercase letter");
			System.out.println((k==97 || k==101 || k==107 || k==111 || k==117)?("Vowel"):("consonant"));
		}
		else {
			System.out.println("Character is not alphabet");
		}
		// TODO Auto-generated method stub

	}

}