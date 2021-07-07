package may2nd;

public class HelloWorld {
	int x=90, y=80;//Instance variable
	
	static int a=90, b=80;//Class variable
	
	public static void main(String[] args) {
		HelloWorld ob1= new HelloWorld();
		ob1.x=ob1.x+10;
		ob1.y=ob1.y-10;
		
		ob1.a=ob1.a+10;
		ob1.b=ob1.b-10;
		
		System.out.println("Value of ob1.x is: "+ob1.x+" Value of ob1.y is :"+ob1.y);//100 70
		System.out.println("Value of ob1.a is: "+ob1.a+" Value of ob1.b is :"+ob1.b); //100 70
		
		HelloWorld ob2 = new HelloWorld();
		System.out.println("Value of ob2.x is: "+ob2.x+" Value of ob2.y is :"+ob2.y);//90 80
		System.out.println("Value of ob2.a is: "+ob2.a+" Value of ob2.b is :"+ob2.b);//100 70
		
		
	}
}
