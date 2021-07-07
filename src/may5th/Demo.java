package may5th;

public class Demo {
	public static void main(String[] args) {
		Demo ob = new Demo();
		ob.addNumbers(10,20);//method call statement
		
		ob.addNumbers(30, 50);
		
		ob.addNumbers(100,45);
	}
	
	void addNumbers(int a, int b){//Instance method
		int c= a+b;
		System.out.println("Addition of a,b is :"+c);
		
		getMax(a, b);//method call statement
	}
	
	void getMax(int x, int y){//x=b==> 20, 50
		if(x>y){
			System.out.println("X is greater value :"+x);
		}else if(x<y){
			System.out.println("Y is greater value :"+y);
		}else{
			System.out.println("Both X&Y values are same :"+x);
		}
	}
}
