package patterns;

public class edges {

	public static void main(String[] args) {
		for(int r=1;r<=4;r++) {
			for(int c=1;c<=4;c++) {
				if(c==1 || c==4 ||r==1||r==4)
					System.out.print("* ");
				else
					System.out.print("  ");
			}
			System.out.println();
		}

	}

}
