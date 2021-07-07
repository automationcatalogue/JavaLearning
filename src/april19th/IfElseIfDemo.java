package april19th;

public class IfElseIfDemo {
	public static void main(String[] args) {
		int a=99, b=87, c=121;
		
		if(a<=b || a==c){
			System.out.println("Core Java");
		}else if(a!=b && c<a){
			System.out.println("Advanced Java");
		}else if(a>=25 && (a<=99 || c>=500)){
			System.out.println("Python");
		}else{
			System.out.println("Vijetha..!!!");
		}
	}
}
