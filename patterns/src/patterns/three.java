package patterns;

public class three {

	public static void main(String[] args) {
		int start=1,end=4;
		for(int r=start;r<=end;r++) {
			for(int c=start;c<=end;c++) {
				if(r+c>=start+end)
					System.out.print("* ");
				else
					System.out.print("  ");
			}
			System.out.println();
		}

	}

}
