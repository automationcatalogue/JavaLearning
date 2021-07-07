package april19th;

public class IfDemo {
	public static void main(String[] args) {
		int a=75, b=66;
		
		System.out.println("This is If Demo program");
		
		if(a==b && a>=b){
			System.out.println(" I am inside the if condition");
		}
		
		System.out.println("I am end of the program!!!");
		
		char vijetha='v', sagar='s';
		if(vijetha>=99 || sagar<=100){
			int i =5, j=10;
			++i;//6
			System.out.println("Value of i is :"+i);
			j--;//9
			System.out.println("Value of j is :"+j);
			
			int k=i-j;
			System.out.println("Value of k is :"+k);
			
		}
		
		
	}
}

class IfDemo1 {
	public static void main(String[] args) {
		int a=30;
		System.out.println("Hello World..!!!");
		
		if(false){
			System.out.println("This is a Core Java Program");
		}
		
		if(a==20){
			System.out.println("Value of a is :"+a);
		}
		
		a=200;
		
		boolean b=a>=100;
		if(b){
			System.out.println("Value of a is greater than 100");
		}
	}

}

class IfDemo2 {
	public static void main(String[] args) {
		int x=90, y=45, z=55;
		
		boolean a=x>y;
		boolean b=y<z;
		
		if(b){
			System.out.println("x is smaller than y");
		}
		
		if(false){
			System.out.println("This is If Demo1 program");
		}
	}
}
class IfDemo3 {
	public static void main(String[] args) {
		int x=90,y=45,z=65;
		
		if((x>y) && (x==y)){
			x=78;
			System.out.println("I am in the if condition");
			System.out.println("x value is: "+x);
			System.out.println("y value is: "+y);
			System.out.println("z value is: "+z);
			y=99;
			z=100;
		}
		
		System.out.println("After If Statement, x value is :"+x+" y value is "+y+" z value is"+z);
	}
}



















