package classexe;

public class lesser {
	
	public static void main(String args[]) {
		int a=50,b=20,c=40,temp;
		if(a>b) { //30>20
			temp=a; //temp=30
			a=b; //a=20
			b=temp;	//b=30
		}
		if(c<b) { //30>20
			temp=b; //temp=30
			b=c; //b=10
			c=temp; //c=30
		}
		if(b<a) { //10<40
			temp=a;
			a=b;
			b=temp;
		}
		System.out.println(a);
		System.out.println(b);
		System.out.println(c);
	}

}
