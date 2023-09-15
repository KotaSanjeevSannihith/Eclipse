package nestedfor;

public class palindromerange {

	public static void main(String[] args) {
		int x,y,pal=0,rem=0;
		for(x=100;x<=20000;x++) {
			pal=0;
			for(y=x;y!=0;y/=10) {
				rem=y%10;
				pal=pal*10+rem;
			}
			if(pal==x) {
				System.out.println(pal);
			}
		}

	}

}
