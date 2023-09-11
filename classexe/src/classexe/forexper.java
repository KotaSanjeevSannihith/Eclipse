package classexe;

public class forexper {

	public static void main(String[] args) {
		int x;
		for(x=1;x<11;x++)
		{
			if(x==7) {
				continue;//skips the loop at x=7
			}
			System.out.println(x);
		}
	}

}
