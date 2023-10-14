
public class Replace {

	public static void main(String[] args) {
		String arr[]=new String[] {"Mahesh","Din Djarin","Taylor","Arjun"};
		String replace="bhAAi";
		for(int x=0;x<arr.length;x++)
		{
			if(arr[x].equals("Din Djarin"))
			{
				arr[x]=replace;
			}
		}
		for(String temp:arr)
			System.out.print(temp+"  ");
	}

}
