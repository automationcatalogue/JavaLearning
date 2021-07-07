package stringHandling;

public class StringPrograms4 {
	public static void main(String[] args) {
		String s1="Hello";
		String s2="hello";
		
		int value=s1.compareTo(s2);
		System.out.println("Value after the comparing of s1&s2 Strings is :"+value);
		
		boolean b=s1.equalsIgnoreCase(s2);
		System.out.println(b);
		
		char ch=s1.charAt(3);
		System.out.println(ch);
		
		s1=s1.replace('l', 'a');
		System.out.println(s1);
		
		s1=s1.replace("aa", "xyzABCD");
		System.out.println(s1);
	}
	
}
