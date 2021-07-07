package stringHandling;

public class StringPrograms5 {
	public static void main(String[] args) {
		String s1="Tajmahal";
		String s2="Tajmahal";
		
		System.out.println(s1.equals(s2));
		System.out.println(s1==s2);
		
		String s3=new String("Tajmahal");
		String s4=new String("Tajmahal");
		
		System.out.println(s3.equals(s4));
		System.out.println(s3==s4);
		
	}
}
