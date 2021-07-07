package may3rd;

public class ArrayDemo {
	public static void main(String[] args) {
		int a[] = new int[8];// 0 to 7
		
		int b=10;
		
		a[3]=99;
		a[4]=76;
		a[5]=a[3]+a[4];
		
		a[6]=a[5]-10;
		a[7]=a[3]*2;
		
		/*System.out.println(a[0]);
		System.out.println(a[1]);
		System.out.println(a[2]);
		System.out.println(a[3]);
		System.out.println(a[4]);
		System.out.println(a[5]);
		System.out.println(a[6]);
		System.out.println(a[7]);*/
		
		/*for(int vijetha=0;vijetha<=7;vijetha++){
			System.out.println(a[vijetha]);
		}*/
		
		int d=3;
		
		System.out.println("a["+d+"] = " + a[d]);
		
	}
}
