package classexe;

public class evensumoddprod {

	public static void main(String[] args) {
		int a=1,b=50,sum=0;
		long mul=1;
		while(a<=b){
			if(a%2==0) {
				sum=sum+a;
			}
			else if(a%2==1) {
				mul=mul*a;
				System.out.println(mul);
			}
			a++;
		}
		//System.out.println(sum);
		//System.out.println(mul);
	}

}
