package may2nd;

public class Demo {
	
	static int a=5, b;//Class variables
	
	int prashanth=82;//Instance variable
	
	public static void main(String[] args) {
		
		int t=32;
		
		b=a*a*a;// By using directly
		System.out.println("Cube of the given number is: "+b);
		
		Demo.a = Demo.a+Demo.b;//By using ClassName
		System.out.println("Addition of a,b is :"+a);
		
		Demo vijetha = new Demo();
		
		if(vijetha.a%2==0){//By using Object Reference
			System.out.println("Even number");
		}else{
			System.out.println("Odd Number");
		}
		
		Demo.b = new Demo().a+100;//By using Object
		System.out.println("Value of a, b is:"+a+""+b);
		
	}
}
