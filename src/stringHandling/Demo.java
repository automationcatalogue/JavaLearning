package stringHandling;

public class Demo {
//public class Demo extends Object{
	public static void main(String[] args) {
		String s1= new String("Vijetha");
		System.out.println(s1);
		
		String s2="Sagar";
		System.out.println(s2);
		
		int x=s1.length();
		System.out.println("Length of s1 is  :"+x);
		
		String s3=s1.toUpperCase();
		System.out.println(s3);
		
		s1="Hello India, welcome to the Java learning";
		int y=s1.length();
		System.out.println("Length of s1 is: "+y);
		
		s3=s1.toUpperCase();
		System.out.println(s3);
		
		s3=s1.toLowerCase();
		System.out.println(s3);
		
		
		int z=s2.length();
		System.out.println("length of the s2 is :"+z);
		
		int a[]= new int[5];
		
	}
	
}
