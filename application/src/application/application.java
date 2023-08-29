package application;

public class application {
	public static void main(String args[]) {
		String productname="Bingo";
		System.out.println(productname);
		int quantity=10;
		double price=50.0;
		double total=quantity*price;
		double discount;
		if(total>=500){
			discount=total*10.0/100;
		}
		else {
			discount=total*5.0/100;
		}
		double finalprice=total-discount;
		System.out.println(finalprice);
	}
}
