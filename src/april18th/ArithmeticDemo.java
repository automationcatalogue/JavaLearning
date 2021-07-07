package april18th;

public class ArithmeticDemo {
	public static void main(String[] args) {
		int a=10, b=20;
		int c=a+b;
		System.out.println("Addition of a,b is :"+c);//30
		
		a=c-50;
		System.out.println("After the subtraction :"+a);//-20
		
		int d=b*a;
		System.out.println("Multiplication of values is :"+d);//-400
		
		d=d/c;
		System.out.println("Division of values is :"+d);//
		
		int e=d%5;
		System.out.println("Reminder value is :"+e);
		
		e=74;
		e=e%9;
		System.out.println(e);
	}
}
