package april18th;

public class LogicalDemo {
	public static void main(String[] args) {
		int sagar=850;
		++sagar;//851
		
		boolean a=(sagar>=851);//true
		
		int vijetha=900;
		vijetha--;//899
		
		boolean b=(vijetha>=899);//true
		
		boolean c=a&&b;
		System.out.println("value of c is :"+c);
		
		
		
		
	}
}

class LogicalDemo1{
	public static void main(String args[]){
		int a=10, b=45, c=22;
		boolean d=((a<c) && (a>b)) || (b>c);//true && false
		System.out.println(d);//true
		
		boolean e=((a<c) || (a>b));
		System.out.println(e);//true
		
	}
}






















