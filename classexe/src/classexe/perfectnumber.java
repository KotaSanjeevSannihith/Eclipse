package classexe;

public class perfectnumber {

	public static void main(String[] args) {
		int num=496,i=1,count=0;
		while(num>i) {
			if(num%i==0) {
				count+=i;
			}
			i++;
		}
		if(count==num) {
			System.out.println("Perfect number");
		}
		else {
			System.out.println("not a perfect number");
		}

	}

}
