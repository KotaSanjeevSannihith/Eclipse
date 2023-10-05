import java.util.Scanner;
public class one {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		
		int[] num=new int[4];
		for(int x=0;x<num.length;x++)
		{
			num[x]=sc.nextInt();
			//sc.nextLine();
		}
		for(int x=0;x<num.length;x++)
		{
			System.out.print(num[x]+"  ");
		}
		
		
	}

}
