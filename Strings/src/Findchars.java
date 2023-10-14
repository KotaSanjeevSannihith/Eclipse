public class Findchars 
{
	public static void main(String[] args) 
	{
		String s="asdoasiOCJIOJ234567VIO#$%^&*";
		int x;
		int uc=0,lc=0,n=0,sym=0;
		for(x=0;x<s.length();x++)
		{
			int y=s.charAt(x);
			if(y>=65 && y<=90)
				uc++;
			else if(y>=97 && y<=122)
				lc++;
			else if(y>=49 && y<=58)
				n++;
			else
				sym++;
		}
		System.out.println("Upper Case: "+uc);
		System.out.println("Lower Case: "+lc);
		System.out.println("Number: "+n);
		System.out.println("Symbols: "+sym);
	}
}
