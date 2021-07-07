package may7th;

public class HelloWorld {
	
	int x=10;
	
	void show(){
		
		System.out.println(this.x);
	}
	
	public static void main(String[] args) {
		HelloWorld ob1 = new HelloWorld();
		HelloWorld ob2 = new HelloWorld();
		
		ob1.x=ob1.x+3;
		ob1.show();
		ob2.show();
	}
	
}
