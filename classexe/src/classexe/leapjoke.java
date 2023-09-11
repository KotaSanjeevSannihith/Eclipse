package classexe;

public class leapjoke {

	public static void main(String[] args) {
		int year=1921,first=0,last=0,k=0;
		if(year%4==0 && (year%100!=0 || year%400==0)) {
			first=year/100;
			last=year%100;
			k=first+last;
			if(k%2==0) {
				System.out.println("leap year      even");
			}
			else {
				System.out.println("leap year      odd");
			}
		}
		else {
			first=year/100;
			last=year%100;
			k=first+last;
			System.out.println("not a leap year      "+k);
		}
		// TODO Auto-generated method stub

	}

}
