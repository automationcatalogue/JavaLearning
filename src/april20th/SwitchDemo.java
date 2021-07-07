package april20th;

public class SwitchDemo {
	public static void main(String[] args) {
		char a=97;
		
		switch(a){
			case 'a':
				int x=10, y=20;
				System.out.println("Addition of two number is :"+ (x+y));
				
			case 'b':
				int m=5;
				m=m*m*m;
				System.out.println("cube of the given number is :"+m);
				
			case 'c': 
				int vijhetha=66;
				if(vijhetha>=0){
					System.out.println("Given number is positive "+vijhetha);
				}else{
					System.out.println("Given number is negative "+vijhetha);
				}
				break;
			case 'd':  
				int sagar=24;
				if(sagar%2==0){
					System.out.println("Given number is even"+sagar);
				}else{
					System.out.println("Given number is odd"+sagar);
				}
				
			default: 
				System.out.println("I am in the default block");
				
				
				
		}
	}
}

class SwitchDemo1 {
	public static void main(String args[]){
		int x=1;
		int a=99;
		int en=90, sc=80, so=70, m=75;
		int z=9;
		char T='d';
		
		switch(x){
			
		case 1:
			if(a%2==0){
				System.out.println("Given number is Even "+a);
			}else{
				System.out.println("Given number is Odd "+a);
			}
			
		case 2: 
			int avg=(en+sc+so+m)/4;
			System.out.println("Avg of the marks is "+avg);
			break;		
		case 3:
			System.out.println("Cube of the given number is :"+ (z*z*z));
			break;
		default:
			System.out.println("I am in the default case");
			
		}
		
			
	}
}

