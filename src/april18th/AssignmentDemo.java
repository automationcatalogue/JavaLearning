package april18th;

public class AssignmentDemo {
	public static void main(String[] args) {
		int a=87;
		a+=50; //a=a+50
		System.out.println("value of a is :"+a);//137
		
		int b=100;
		b=b-(a+=20);
		System.out.println("Value of b is :"+b);//-57
		
		b=42;
		b*=a;//b=b*a
		System.out.println("multiplication data is :"+b);//6594
		
		int c=b%=10;//b=b%10
		System.out.println("Value of data is: "+c);
		
		boolean vijetha=(b==4);		
		System.out.println("Value of the boolean is :"+vijetha);
		
		
	}
}
