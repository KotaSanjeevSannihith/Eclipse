
public class methods {

	public static void main(String[] args) {
		int[] a=new int[] {10,20,30,40,50,60,70,80,90,100,110,120,130,140,150};
		Array arr=new Array();
		int find=110;
		arr.isArray(a,find);
	}

}
class Array
{
	public void isArray(int k[],int l)
	{
		int enable=0;
		for(int x:k)
		{
			if(x==l)
			{
				enable=1;
				break;
			}
		}
		System.out.println(enable==1?"Found":"Not Found");
	}
}