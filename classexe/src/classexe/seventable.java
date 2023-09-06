package classexe;

public class seventable {

	public static void main(String[] args) {
		int num=7,i;
		if(num%2==0) {
			for(i=1;i<=20;i++) {
				System.out.println(num+" x "+i+" = "+(num*i));
			}
		}
		else {
			for(i=2;i<=20;i+=2) {
				System.out.println(num+" x "+i+" = "+(num*i));
			}
		}
	}

}
