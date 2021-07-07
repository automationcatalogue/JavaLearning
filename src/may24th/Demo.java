package may24th;

public abstract class Demo {
	abstract void show();//abstract method
	
	void display(){//non-abstract method
		int x=4;
		int y= x*x*x;
		System.out.println("Cube of the given number is:"+y);
	}
	
	
}
