package patterns;

public class arrow {

	public static void main(String[] args) {
		int rows=5,columns=5;
		for(int r=rows;r>=1;r--) {
			for(int c=columns;c>=1;c--) {
				if(r+c>rows+1)
					System.out.print("  ");
				else
					System.out.print("* ");
			}
			System.out.println();
		}
	}
}
