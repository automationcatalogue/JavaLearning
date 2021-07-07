package april20th;

public class WhileDemo {
	public static void main(String[] args) {
		int i=1;
		
		while(i<=14){
			System.out.println("I am Vjetha...!!!"+i);
			i=i+5;
		}
		System.out.println("Value of i is :"+i);
	}
}

class WhileDemo1{
	public static void main(String[] args) {
		int a=1;
		System.out.println("This is sagar");
		while(a<=10){
			System.out.println(a);
			a=a*3;
		}
		System.out.println("This is vijetha");
	}
}
class WhileDemo2 {
	public static void main(String[] args) {
		int x=2;//Initializaton
		while(x<=5){
			//x=20;
			System.out.println("Hello");
			System.out.println("Core Java");
			x++;
		}
		System.out.println("Value of x is :"+x);
		
	}
}

class WhileDemo3 {
	public static void main(String[] args) {
		int y=3;
		while(y<=20){
			System.out.println(y);
			
		}
	}
}

class WhileDemo4 {
	public static void main(String[] args) {
		int n=456;
		boolean b=(n>=100);
		while(b){
			n=n/10;
			System.out.println(n);
			b=false;
		}
		System.out.println("This is While Loop Demo");
	}
}

























