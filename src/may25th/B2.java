package may25th;

public class B2 implements A2{
	int y=10;//Instance variables
	
	public void show(){
		int a=5;
		int b= a*a*a;
		System.out.println("Cube of the given number is :"+b);
	}
	
	void display(){
		int a=10, b=20;
		int c=a+b;
		System.out.println("Addition of the a&b is : "+c);
	}
}
