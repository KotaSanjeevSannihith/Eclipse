package classexe;

public class upperlower {
	
	public static void main(String args[]) {
		
		char temp='A';
		int temp1=(int)(temp),t=0;
		System.out.println(temp1);
		if(temp1>=65) {
			if(temp1<=90) {
				t=temp1+32;
			}
			else if(temp>=97) {
				if(temp1<=122) {
					t=temp1-32;
				}
			}
		}

		else {
			System.out.println("Given character is not a alphabet");
		}
		temp=(char)(t);
		System.out.println(temp);
	}
	
}
