package may7th;

public class Demo1 {
	
	int x=5;//Instance variable
	
	void show(){//Instance method
				//without return Type and without arguments
		
		System.out.println(x);//by using object reference --> this
		
		x=x+100;
		//this.x = this.x+100;
		System.out.println(this.x);
		
	}
	
	public static void main(String[] args) {
		
		Demo1 ob = new Demo1();
		
		ob.show();
		
		Demo1 vij= new Demo1(); 
		vij.show();
		
	}
}
