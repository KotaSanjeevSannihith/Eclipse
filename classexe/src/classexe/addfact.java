package classexe;

public class addfact {

	public static void main(String[] args) {
		int num=54,first,second,fact=1,i=1,k=1;
		first=num%10;
		second=num/10;
		num=first+second;
		System.out.println(first+" "+second);
		while(num>=i) {
			fact*=num;
			num--;
		}
		System.out.println(fact);
		while(k<=num/2) {
			if(num%k==0) {
				System.out.println(k);
			}
			k++;
		}

	}

}