package patterns;

public class five {

	public static void main(String[] args) {
		int rows=5;
		for(int r=1;r<=rows;r++) {
			for(int c=rows;c>=r;c--) {
				System.out.print(c+" ");
			}
			System.out.println();
		}
		

	}

}
