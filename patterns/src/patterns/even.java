package patterns;

public class even {

	public static void main(String[] args) {
		int rows=5,columns=5,temp=2;
		for(int r=1;r<=rows;r++)
		{
			for(int c=1;c<=columns;c++)
			{
				if(c<=r) 
				{
					System.out.print(temp+" ");
					temp+=2;
				}
			}
			System.out.println();
		}
	}

}
