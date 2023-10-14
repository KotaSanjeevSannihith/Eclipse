
public class Selectionsort {

	public static void main(String[] args) {
		String ss="hello all good morning";
		char a[]=ss.toCharArray();
		int min=0,x,y;
		char temp=' ';
		for(x=0;x<a.length;x++)
		{
			min=x;
			for(y=x+1;y<a.length;y++)
			{
				if(a[min]>a[y])
				{
					y=min;
				}
			}
			temp=a[min];
			a[min]=a[y];
			a[y]=temp;
		}
		for(char temp1:a)
		{
			System.out.print(temp1+" ");
		}

	}

}
