package classexe;

public class greater {
	
	public static void main(String args[]) {
		int a=60,b=50,c=70,temp;
		if(a>b) {
			if(b>c) {
				temp=a;
				a=c;
				c=temp;
				System.out.println(a);
				System.out.println(b);
				System.out.println(c);
			}
			else {
				temp=a;
				a=b;
				b=c;
				c=temp;
				System.out.println(a);
				System.out.println(b);
				System.out.println(c);
				}
			}
		if(b>a) {
			if(a>c) {
				temp=b;
				b=a;
				a=c;
				c=temp;
				System.out.println(a);
				System.out.println(b);
				System.out.println(c);
			}
			else {
				temp=b;
				b=c;
				c=temp;
				System.out.println(a);
				System.out.println(b);
				System.out.println(c);
			}
			
		}
		if(c>a) {
			if(a>b) {
				temp=a;
				a=b;
				b=temp;
				System.out.println(a);
				System.out.println(b);
				System.out.println(c);
			}
			else {
				System.out.println(a);
				System.out.println(b);
				System.out.println(c);
			}
		}
		}
	}


