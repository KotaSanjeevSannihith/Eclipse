package nestedfor;

public class primerange {

	public static void main(String[] args) {
		int x,y,temp;
		for(x=30;x<=100;x++) {
			temp=0;
			for(y=2;y<=x/2;y++) {
				if(x%y==0) {
					temp++;
					break;
				}

			}
			if(temp==0) {
				System.out.println(x);
			}
		}

	}

}
