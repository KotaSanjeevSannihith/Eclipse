package homework;

public class library {
	public static void main(String args[]) {
		
		int days=15;
		//double fine=0;
		//if(days>=0 && days<=5) {
		//	fine=0.5;
		//	System.out.println("Your fine is : "+fine);
		//}
		//else if(days>=6 && days<=10) {
		//	fine=1;
		//	System.out.println("Your fine is : "+fine);
		//}
		//else if(days>=11 && days<=30) {
		//	fine=5;
		//	System.out.println("Your fine is : "+fine);
		//}
		//else {
		//	System.out.println("Your membership is cancelled");
		//}
		System.out.println((days>=0 && days<=30)?((days<=5)?("0.5"):(days>=6 && days<=10)?("1"):("5")):("Your membership cancelled"));
		
	}

}
