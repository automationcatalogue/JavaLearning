package april20th;

public class NestedIfDemo {
	public static void main(String[] args) {
		int a=-44;
		System.out.println("Hello India....!!!");
		if(a>=0){//Outer if condition
			System.out.println("Positive number");
			if(a%2==0){//Inner if condition
				System.out.println("Even number");
			}
		}else if (a>=500){
			System.out.println("Negative number");
			if(a>=-50){
				System.out.println("Number which is greater than -50");
			}else{
				System.out.println("Number which is less than -50");
			}
		}
		System.out.println("Vijetha..!!!");
	}
}
class NestedIfDemo1 {
	public static void main(String[] args) {
		int n=84;
		if(n%2==0){
			System.out.println("EvenNumber");
			if(n>=80){
				System.out.println("Distinction");
				n=-25;
				if(n>=0){
					System.out.println("PositiveNumber");
				}else{
					System.out.println("NegativeNumber");
				}
			}else if(n>=50 && n<70){
				System.out.println("FirstClass");
			}else{
				System.out.println("Fail");
			}
			
		}else{
			System.out.println("OddNumber");
			if(n==70){
				System.out.println("Core Java");
			}else if(n==60){
				System.out.println("Advanced Java");
			}else{
				System.out.println("Java programming");
			}
		}
	}
}
class NestedIfDemo2 {
	public static void main(String[] args) {
		int x=97;
		if(x<='d'){
			System.out.println("Given number is a");
			x=120;
			if(x>=110){
				System.out.println("Core Java");
			}
			System.out.println("Advanced Java");
		}
		System.out.println("Value of x is after Nested If :"+x);
	}
}






















