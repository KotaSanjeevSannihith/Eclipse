public class Armstrong 
{
	public static void main(String args[])
	{
		String s=new String("13");
		int len=s.length();
		char a[]=s.toCharArray();
		int arm=0;
		for(int x=0;x<len;x++)
		{
			arm+=(int)Math.pow(Character.getNumericValue(a[x]), len);
		}
		System.out.println(arm==Integer.parseInt(s)?"Armstrong":"Not an Armstrong");
	}
}
