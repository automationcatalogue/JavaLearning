package may19th;

public class Demo {
	
	
	void print(int a, int b){
		int c=a+b;
		System.out.println("Addition of two number is :"+c);
		int d=a-b;
		System.out.println("Subtraction of two numbers is :"+d);
	}
	
	
	void show(){
		System.out.println("Core Java...!!!");
		System.out.println("Advanced Java...!!!");
	}
	public static void main(String[] args) {
		Demo ob = new Demo();
		ob.print(10, 20);
	}
	

}
