package homework;

public class insurance {
	public static void main(String args[]) {
		
		int age=37;
		String name="Maheshwari ",health="good";
		char gender='M';
		double premium=0,policy=0;
		String place="village";
		if((age>=25 && age<=35)&&(health=="good")&& place=="city") {
			if(gender=='M' && policy<=200000) {
				premium=4.0*policy/1000;
			}
			else if(gender=='F' && policy<=150000) {
				premium=3.0*policy/1000;
			}
			
		}
	}
}