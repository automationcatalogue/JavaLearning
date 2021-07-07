package stringHandling;

public class StringPrograms3 {
	public static void main(String[] args) {
		String s4="Vijetha is learning Selenium and she is very proactive";
		
		String s5=s4.substring(13);
		System.out.println(s5);
		
		s5=s4.substring(15, 25);
		System.out.println(s5);
		
		int z=s4.hashCode();
		System.out.println(z);
		
	}
}
