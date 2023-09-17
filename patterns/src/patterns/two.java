package patterns;
public class two {
	public static void main(String[] args) {
		int start=1,end=9;
		for(int r=start;r<=end;r++) {
			for(int c=start;c<=end;c++) {
				if(c==start||c==end||r==start||r==end||(r==c)||(r+c==end+start))
					System.out.print("* ");
				else
					System.out.print("  ");
			}
			System.out.println();
		}

	}

}