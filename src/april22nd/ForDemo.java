package april22nd;

public class ForDemo {
	
	ForDemo ob = new ForDemo();
	public static void main(String[] args) {
		
		
		
		
		for(int i=1;i<=6;i++){
			System.out.println("Hello Vijetha...!!!");
		}
	}
	
}

class ForDemo1 {
	public static void main(String args[]){
		int n;
		for(n=56;n<=75;n=n+8){
			System.out.println(n);
			System.out.println("Core Java");
		}
		System.out.println("This is the forloop demo");
	}
}	

class ForDemo2 {
	public static void main(String[] args) {
		
		System.out.println("Before For loop");
		int i=100;
		for(i=20;i<=35;i=i+3){//24 24<=35; 28 28<=35;32 32<=35
			System.out.println("value of i is :"+i);//20 24 28 32
			i++;//21 25 29 33
		}
		
		System.out.println("After For Loop, value of i is :"+i);
		
	}
}


class ForDemo3 {
	public static void main(String[] args) {
		
		for(int i=20;i>=8;i=i-5){
			System.out.println(i);
		}
		
		int i=0;
		boolean b=(i<=20);//true
		for(i=1;b;i=i+3){//14 14<=20;17 17<=20; 20 20<=20
			
			if(i<=5){//1<=5
				i=i+10;//11
				System.out.println("Core Java and i value is :"+i);//11
			}else{
				System.out.println("Advanced Java and i value is :"+i);//14 17 20
			}
		}
		
		System.out.println("Final value of i is :"+i);//23
		
	}
}
















