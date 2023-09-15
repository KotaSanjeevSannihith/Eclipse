
public class twinprimes {

	public static void main(String[] args) {
		int num1=17,num2=5,temp,count1=0,count2=0;
		for(temp=2;temp<=num1/2;temp++) {
			if(num1%temp==0) {
				count1++;
			}
		}
		//System.out.println(count1);
		for(temp=2;temp<=num2/2;temp++) {
			if(num2%temp==0) {
				count2++;
			}
		}
		//System.out.println(count2);
		if(count1==0 && count2==0) {
			if((num1-num2==2) || (num1-num2==-2)) {
				System.out.println("twin primes");
			}
			else {
				System.out.println("not twin primes");
			}
		}

	}

}
