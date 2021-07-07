package may14th;

public class B extends A{
	
	//Method definition
	//Method with return type and with arguments
	//Instance method
	
	int prime(int x){
		int count=0;
		for(int i=1;i<=x;i++){
			
			if(x%i==0){
				count++;
			}
			
		}
		return count;
	}
	
	void print(){
		int x=4;
		int y=x*x*x;
		System.out.println("cube of the give number is "+y);
	}
	
	
	public static void main(String[] args) {
		B ob = new B();
		
		
		ob.show();
		//super.print();
	}
	
	void show(){
		this.print();
		super.print();
	}
}
