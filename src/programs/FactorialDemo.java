package programs;

import java.util.Scanner;

public class FactorialDemo {
	public static void main(String[] args) {
		
		Scanner s = new Scanner(System.in);
		
		int fact=1, n;
		System.out.println("Enter the value of n");
		n=s.nextInt();
		
		int temp=n;
		
		for(;n>=1;n--){
			fact=fact*n;
		}
		
		System.out.println("Factorial of a "+temp+" number is "+fact);
	}
}
