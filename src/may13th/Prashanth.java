package may13th;

public class Prashanth extends Vijetha{
	int sum=56;//Instance variable
	
	public static void main(String[] args) {
		
		Prashanth ob = new Prashanth();
		ob.print();
		
		ob.main();
	}
	
	void print(){
		int sum=99;//Local variable
		System.out.println(sum);
		System.out.println(this.sum);
		System.out.println(super.sum);
		
	}
}
