package may8th;

public class Demo {
	
	int a=10;//Instance variable
	
	Demo(){//Default Constructor
		
		int a=6;
		int b=a*a*a;
		System.out.println("Cube of the given number is :"+b);
	}
	
	Demo(int a){//Parameterized constructor
		this();
		if(a%2==0){
			System.out.println("a is even number :"+a);
		}else{
			System.out.println("a is odd number :"+a);
		}
		
	}
	
	
	void addNumber(){
		int a=10, b=20;
		int c=a+b;
		System.out.println("Addition of a,b is:"+c);
	}
	
	public static void main(String[] args) {
		System.out.println("Hello Vijetha...!!!");
		
		Demo ob1=new Demo(48);
		
		
		
	}
	
}
