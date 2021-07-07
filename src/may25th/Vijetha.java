package may25th;

public class Vijetha implements Demo{
	public static void main(String[] args) {
		System.out.println(Demo.i);
		
	}
	
	public void show(){
		int a=10;
		if(a%2==0){
			System.out.println("Even Number!!!");
		}else{
			System.out.println("Odd Number!!!");
		}
	}
	
	public void print(){
		System.out.println("Core Java!!!");
	}
}
