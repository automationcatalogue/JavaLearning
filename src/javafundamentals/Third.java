package javafundamentals;

public class Third {
	public static void main(String[] args) {
		int a=80;
		System.out.println("Value of a is "+a); //80
		
		int vijetha=100;
		System.out.println("value of vijetha is "+vijetha); //100
		
		vijetha=vijetha-a;
		System.out.println("Value of vijetha is "+vijetha);//20
		
		int d=a+vijetha;
		System.out.println("Addition and d value is "+d);//100
		
		vijetha=900;
		a=a*vijetha;
		System.out.println("value of a is "+a);//72000
		
		int c=a+vijetha;
		System.out.println("Addition is :"+c);//72900
	}
}
