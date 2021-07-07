package april18th;

public class TernaryDemo {
	public static void main(String[] args) {
		int a=99, b=88;
		
		a=(a<b)?500:350;
		System.out.println("value of a is :"+a);
	}
}

class TernaryDemo1{
	public static void main(String[] args) {
		char ch='G';
		int x1=(ch==99)?100:'G';
		System.out.println("x1 value is :"+x1);//71
		
		int x=89, y=100,z;
		z=(x>y)?x:y;
		System.out.println("z value is :"+z);//100
		
		z=(x<y)?300:500;
		System.out.println("z value is :"+z);//300
	}
}