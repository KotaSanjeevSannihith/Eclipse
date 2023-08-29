package homework;

public class perimeterarea {
	public static void main(String args[]) {
		double l=5.0,b=4.0;
		double perimeter=2*(l+b),area=l*b;
		if(perimeter>area) {
			System.out.println("Perimeter is greater than area");
		}
		else {
			System.out.println("Perimeter is lesser than area");
		}
	}
	

}
