package homework;

public class profitloss {
	public static void main(String args[]){
		double price=2000;
		double sellerprice=1800;
		double difference;
		if(sellerprice>price) {
			difference= sellerprice-price;
			System.out.println("seller made a profit of "+difference);
		}
		else {
			difference=price-sellerprice;
			System.out.println("seller made a loss of "+difference);
		}
	}
}
