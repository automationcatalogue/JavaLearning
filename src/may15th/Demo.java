package may15th;

public class Demo {
	
	private static int x=10;//Instance variable
	static int y=20;
	protected static int z=30;
	public static int a=99;
	
	public static void main(String[] args) {
		Demo ob = new Demo();
		System.out.println(ob.x);
		System.out.println(ob.y);
		System.out.println(ob.z);
		
		ob.print();
		ob.show();
		ob.cube();
	}
	
	private void show(){
		System.out.println("Core Java");
	}
	
	void print(){
		System.out.println("Advanced Java");
	}
	
	protected void cube(){
		int x=5;
		int y=x*x*x;
		System.out.println("cube of the given number is :"+y);
	}
	
	public void evenOdd(){
		int x=9;
		if(x%2==0){
			System.out.println("Even number!!!");
		}else{
			System.out.println("Odd number!!!");
		}
	}
	
}
