package stringHandling;

public class StringPrograms2 {
	public static void main(String[] args) {
		String ob1="Hello";
		String ob2="Sagar";
		
		System.out.println(ob1);
		System.out.println(ob2);
		
		String ob3=ob1.concat(ob2);
		System.out.println(ob3);
		ob3 = ob2.concat(ob1);
		System.out.println(ob3);
		
		boolean b=ob3.contains("ela");
		System.out.println(b);
	}
}
