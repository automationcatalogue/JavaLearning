package april19th;

public class IfElseDemo {
	public static void main(String[] args) {
		long abcd=999;
		
		boolean vijetha=(abcd>=5000);
	
		if(vijetha){
			int i=5, j=7;
			System.out.println(i++ * ++j);
			System.out.println("Value of i is :"+i);
			System.out.println("Value of j is :"+j);
		}else{
			int k=9, l=10;
			k--;
			System.out.println(--k * l--);
			System.out.println("Value of k is :"+k);
			System.out.println("Value of l is :"+l);
		}
		
		System.out.println("Hello World...!!!");
	}
}

class IfElseDemo1 {
	public static void main(String[] args) {
		char ch='c', ch1='C';
		int a=100;
		System.out.println("This is before Ifelse demo");
		if(ch==ch1){
			System.out.println("both character and integer values are same");
		}else{
			System.out.println("both character and integer values are not same");
		}
		System.out.println("This is after Ifelse demo");
	}
}






















