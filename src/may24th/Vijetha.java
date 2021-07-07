package may24th;

public class Vijetha extends Demo{
	void show(){
		int a=10, b=20;
		int c=a+b;
		System.out.println("Addition of a&b is :"+c);
	}
	
	void print(){
		
		int a=16;
		if(a%2==0){
			System.out.println("Even Number!!!");
		}else{
			System.out.println("Odd Number!!!");
		}
		
	}
	
	public static void main(String[] args) {
		//Demo ob1 = new Demo();//Invalid, because object cannot be created for a abstract class
		
		/*Vijetha ob2 = new Vijetha();
		ob2.show();
		ob2.print();
		ob2.display(); */
		
		/*Demo ob3 = new Vijetha();
		ob3.show();
		//ob3.print();
		ob3.display();*/
		
		//Vijetha ob4 = new Demo();
		
	}
}
