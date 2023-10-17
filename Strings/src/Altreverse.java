public class Altreverse 
{
	public static void main(String[] args) 
	{
		String s="hello all good morning";
		String k[]=s.split(" ");
		for(int x=0;x<k.length;x++)
		{
			if(x%2!=0)
			{
				StringBuilder sb=new StringBuilder(k[x]);
				k[x]=sb.reverse().toString();
			}
		}
		for(String temp:k)
			System.out.print(temp+" ");

	}

}
