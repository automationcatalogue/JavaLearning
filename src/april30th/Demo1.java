package april30th;

public class Demo1 {
	public static void main(String[] args) {
		int b=4;//Local variable
		
		int c= b*b*b;
		System.out.println("Cube of the given number is :"+c);
		
		if(b%2==0){
			System.out.println("b is a Even number");
		}else{
			System.out.println("b is a Odd number");
		}
	}
}

class Demo2{
	int b=6;//Instance variables
	int c; //Instance variables
	int x=10, y=20;
	
	public static void main(String[] args) {
		Demo2 ob = new Demo2();
		
		ob.c = ob.b * ob.b* ob.b; //By using Object Reference
		System.out.println("Cube of the given number is :"+ob.c);
		
		int a=10;//Local variable
		
		ob.b = a * ob.c;
		System.out.println("Value of b is :"+ob.b);
		
		
		Demo2 ob2 = new Demo2(); 
		
		a= ob2.b + ob2.c;
		System.out.println("Addition of b,c is :"+a);
		
		a= ob.b+ob.c;
		System.out.println("Addition of b,c is :"+a);
		
		
		a=new Demo2().x+new Demo2().y;//By using Object
		System.out.println("value of a is :"+a);
		
		
		
	}
}

























