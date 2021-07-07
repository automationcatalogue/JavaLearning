package may14th;

public class B3 extends A3{
	B3(){//sub class - default constructor
		//super();
		System.out.println("Advanced Java");
	}
	
	B3(int y){//sub class - paramerized constructor
		this();
		System.out.println("y value is :"+y);
	}
	
	public static void main(String[] args) {
		B3 ob = new B3(20);
	}
}
