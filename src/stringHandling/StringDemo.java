package stringHandling;

public class StringDemo {
	public static void main(String[] args) {
		String s1="        Hello Vijetha    and Sagar...     ";
		System.out.println(s1);
		
		s1=s1.trim();
		System.out.println(s1);
		
		String s2="Hello vijetha";
		String s3="hello Vijetha";
		
		boolean b=s2.equals(s3);
		System.out.println(b);
		boolean c=s2.equalsIgnoreCase(s3);
		System.out.println(c);
				
	}
}
