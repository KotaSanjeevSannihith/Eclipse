package classexe;

public class digitprime {

	public static void main(String[] args) {
		int num=57,i,count=0;
		num=num%10;
		for(i=2;num>=i;i++) {
			if(num%i==0) {
				count++;
			}
		}
		if(count>1) {
			System.out.println("composite");
		}
		else {
			System.out.println("Prime");
		}
		// TODO Auto-generated method stub

	}

}
