package may11th;

public class B extends A{
	int y=10;
	
	void show(){
		int x=7;
		int z=x*x*x;
		System.out.println("Cube of the given number is: "+z);
	}
	
	public static void main(String[] args) {
		B ob = new B();
		System.out.println(ob.x);
		System.out.println(ob.y);
		
		ob.print();
		ob.show();
		
		A ob1 = new A();
		System.out.println(ob1.x);
		//System.out.println(ob1.y);
		
		ob1.print();
		//ob1.show();
		
		A ob2 = new B();
		System.out.println(ob2.x);
		//System.out.println(ob2.y);
		
		ob2.print();
		//ob2.show();
		
		//B ob3 = new A();
		
	}
}
