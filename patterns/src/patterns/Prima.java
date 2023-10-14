package patterns;

public class Prima {

	public static void main(String[] args) {
		int r=5,num=2;
		for(int x=1;x<=r;x++)
		{
			int k=2;
			for(int y=1;y<=x;)
			{
				int count=0;
				for(k=2;k<=num/2;k++)
				{
					if(num%k==0)
					{
						count++;
					}
				}
				if(count==0)
				{
					System.out.print(num+" ");
					y++;
				}
				num++;
			}
			System.out.println();
		}

	}

}
