package programs;

public class AscendingDemo {
	public static void main(String[] args) {
		int a=20, b=10, c=32;
		if(a<b && a<c){
			System.out.println("a="+a);
			if(b<c){
				System.out.println("b="+b);
				System.out.println("c="+c);
			}else{
				System.out.println("c="+c);
				System.out.println("b="+b);
			}
			
		}else if(b<c && b<a){
			System.out.println("b="+b);
			if(c<a){
				System.out.println("c="+c);
				System.out.println("a="+a);
			}else{
				System.out.println("a="+a);
				System.out.println("c="+c);
			}
		}
		else if(c<a && c<b){
			System.out.println("c="+c);
			if(a<b){
				System.out.println("a="+a);
				System.out.println("b="+b);
			}else{
				System.out.println("b="+b);
				System.out.println("a="+a);
			}
		}
	}
}
