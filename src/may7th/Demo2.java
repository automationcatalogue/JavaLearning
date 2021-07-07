package may7th;

public class Demo2 {
	
	int x=50;
	
	public static void main(String[] args) {
		
		Demo2 ob = new Demo2();
		ob.show();
		
	}
	
	void show(){
		
		int x=100;
		
		System.out.println(x);
		System.out.println(this.x);
	}
}
