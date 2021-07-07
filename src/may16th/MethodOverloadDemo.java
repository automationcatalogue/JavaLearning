package may16th;

public class MethodOverloadDemo {
	public static void main(String[] args) {
		MethodOverloadDemo ob = new MethodOverloadDemo();
		ob.print(30,50);
		ob.print();
		ob.print(50, 60, 70);
		ob.print(6);
	}
	
	void print(){
		System.out.println("Core Java...!!!");
	}
	
	void print(int a, int b){
		int c=a+b;
		System.out.println("Addition of a,b is :"+c);
	}
	
	
	void print(int x){
		int y=x*x*x;
		System.out.println("Cube of the given number is :"+y);
	}
	
	
	void print(int a, int b, int c){
		System.out.println("Advanced Java...!!!");
	}
}
