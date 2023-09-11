
public class evenminusoddplus {

	public static void main(String[] args) {
		int n,rem=0,count=0,temp=0;
		for(n=6553;n!=0;n/=10) {
			rem=n%10;
			if(rem%2==0)
				rem--;
			else
				rem++;
			temp=(int) (temp+rem*Math.pow(10,count));
			count++;
		}
		System.out.println(temp);
		// TODO Auto-generated method stub

	}

}
