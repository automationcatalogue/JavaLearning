package may16th;


public class MethodOverLoadDemo1 {
	public static void main(String[] args) {
		add(52.5f,68);
		
		add(74, 34.5f);
		
		add(40,50);
		
		MethodOverLoadDemo1.add(50, 90,100);
	}
	
	private static void add(int a, int b){
		int c=a+b;
		System.out.println("Addition of a,b is :"+c);
	}
	
	public static int add(int a, int b, int c){
		int d=a+b+c;
		System.out.println("Addition of ab,b,c is :"+d);
		return d;
	}
	
	protected static void add(int a, float b){
		if(a%2==0){
			System.out.println("Even number");
		}else{
			System.out.println("Odd number");
		}
	}
	
	static void add(float a, int b){
		a=a*2;
		System.out.println("value of a is :"+a);
	}
	
	static float add(float a, float b){
		float c=a-b;
		System.out.println("Subtraction of a,b is :"+c);
		return c;
	}
}
