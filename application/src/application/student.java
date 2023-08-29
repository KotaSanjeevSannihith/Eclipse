package application;

public class student {
	public static void main(String args[]) {
		String name="Din Djarin";
		System.out.println("Student name: "+name);
		double studentpercent=96.9;
		System.out.println("Student Percentage: "+studentpercent);
		double concession;
		double fee=100000;
		if(studentpercent>85) {
			concession=fee*15.0/100;
		}
		else {
			concession=fee*10.0/100;
		}
		System.out.println("The concession is "+concession);
		double finalfee=fee-concession;
		System.out.println("The Final Fee is "+finalfee);
	}

}