package may4th;

public class MethodsDemo {
	
	int vijetha=99;//Instance variable
	
	//Method Definition
	void getMax(){//Instance method
					//method without arguments and without return Type
		System.out.println("This is the program to calculate maximum number");
		int a=10, b=20;
		if(a>b){
			System.out.println("a is greater");
		}else if(a<b){
			System.out.println("b is greater");
		}else{
			System.out.println("a & b are equal");
		}
		
	}
	
	//Method Definition
	static void getMin(){//class method
		System.out.println("This is the program to calculate minimum number");
		int a=10, b=20;
		if(a>b){
			System.out.println("b is smaller");
		}else if(a<b){
			System.out.println("a is smaller");
		}else{
			System.out.println("a & b are equal");
		}
		
	}
	
	
	
	public static void main(String[] args) {
		System.out.println("Hello World....");
		
		MethodsDemo ob = new MethodsDemo();//Created Object
		
		ob.vijetha =ob.vijetha+100;
		System.out.println(ob.vijetha);
		

		ob.getMax();//method call statement
		
		System.out.println("hello prashanth...!!!");
		
		int x=10, y=20;
		x=y*y*y;
		System.out.println(x+" "+y);
		
		ob.getMax();//method call statement
		
		
		MethodsDemo.getMin(); //method call statement
		
	}
	
	
	
}
