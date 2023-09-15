package nestedfor;

public class powernumrange {

	public static void main(String[] args) {
		int num,add,mul,rem;
		for(num=1;num<=1000;num++) {
			int x=num;
			mul=1;
			add=0;
			for(;x!=0;x/=10) {
				rem=x%10;
				add+=rem;
				mul*=rem;
			}
			if(mul==add)
				System.out.println(num);
		}

	}

}
