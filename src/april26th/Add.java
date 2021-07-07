package april26th;

import java.util.Scanner;

public class Add {
	public static void main(String[] args) {
		
		Scanner vijetha= new Scanner(System.in);
		
		int a, b;
		System.out.println("Enter the value of a ");
		a=vijetha.nextInt();
		
		System.out.println("Enter the value of b ");
		b=vijetha.nextInt();
		
		int c=a+b;
		
		System.out.println("Addition of a,b is :"+c);
	}
}
