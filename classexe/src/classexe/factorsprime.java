package classexe;

public class factorsprime {

	public static void main(String[] args) {
		int num=100,i=2,k=1;
		while(i<=num/2) {
			if(num%i==0 && i%k==0) {
				System.out.println(i);
				k++;
			}
			i++;
			
		}
		// TODO Auto-generated method stub

	}

}
