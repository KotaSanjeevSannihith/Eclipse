package classexe;

public class addfact {

	public static void main(String[] args) {
		int num=23,first,second,fact=1,i=1;
		first=num%10;
		second=num/10;
		num=first+second;
		System.out.println(first+" "+second);
		while(num>=i) {
			fact*=num;
			num--;
		}
		System.out.println(fact);

	}

}