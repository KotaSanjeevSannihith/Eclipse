
public class vowel {

	public static void main(String[] args) {
		char car[]=new char[] {'a','b','A','B'};
		for(int x=0;x<car.length;x++)
		{
			if((int)(car[x])>=67 && (int)(car[x])<=90)
			{
				System.out.println("Upper case letters  "+car[x]);
			}
			else if((int)car[x]>=97 && (int)car[x]<=122)
			{
				System.out.println("Lower case letters  "+car[x]);
			}
		}
	}

}
