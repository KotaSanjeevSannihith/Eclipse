package quad;

public class quad {

	public static void main(String[] args) {
		System.out.println("Given Quadratic equation: x^2+2x+1=0");
		double a=2.0,b=3.0,c=-15.0;
		double det=Math.sqrt(Math.pow(b, 2)-4*a*c);
		double rootone=(-b+det)/2*a;
		double roottwo=(-b-det)/2*a;
		System.out.println("1st root is= "+rootone+"  2nd root is= "+roottwo);
	}

}
