public class StringImmutability
{
	public static void main(String[] args) 
	{
		StringBuffer s=new StringBuffer("Hello");
		System.out.println(s.hashCode());
		s.append(" hi");
		System.out.println(s.hashCode());
		System.out.println(s);
		System.out.println("================");
		StringBuilder s1=new StringBuilder("Namaste");
		System.out.println(s1.hashCode());
		s1.append(", Good morning");
		System.out.println(s1.hashCode());
		System.out.println(s1);
	}
}
