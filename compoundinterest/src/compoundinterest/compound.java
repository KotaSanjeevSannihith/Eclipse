package compoundinterest;

public class compound {
	public static void main(String args[]) {
		double p=2000.0,t=5.0,r=12.0;
		double ci=p*Math.pow(1+(r/100),t);
		ci=ci-p;
		int interest=(int)ci;
		System.out.println("Compound interest= "+interest);
	}

}
