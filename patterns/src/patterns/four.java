package patterns;

public class four {

	public static void main(String[] args) {
		int rows=4;
		for(int r=1;r<=rows;r++) {
			
			for(int c=r;c>0;c--) {
				 System.out.print(c+" ");
				 
			}
			System.out.println();
		}

	}

}
