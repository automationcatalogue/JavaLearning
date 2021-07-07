package april22nd;

public class NestedDemo {
	public static void main(String[] args) {
		for(int i=1; i<=3;i++){//1 1<=3; 2<=3; 3<=3; 4
			
			for(int j=1;j<=5;j=j+2){//1
				System.out.print(j+" ");//1 3 5
			}
			System.out.println();
		}
	}
}
