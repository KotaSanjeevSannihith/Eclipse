package nestedfor;

public class automaticrange {

	public static void main(String[] args) {
		int num;
		for(num=1;num<1000;num++) {
			int sq=(int)(Math.pow(num, 2));
			int x=num;
			int count=0;
			for(;x!=0;x/=10) {
				count++;
			}
			if(sq%((int)(Math.pow(10,count)))==num) {
				System.out.println(num);
			}
		}

	}

}
