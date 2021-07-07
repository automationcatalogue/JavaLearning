package april23rd;

public class ContinueDemo {
	public static void main(String[] args) {
		for(int i=1;i<=10;i++){//1 2 3 4 5 6
			
			if(i==5){
				continue;
			}
			
			/*System.out.println("Hello Vijetha...!!!");
			int x=10, y=15;
			System.out.println("Addition of x, y is :"+(x+y));*/
			
			System.out.println(i);
		}
	}
}

class ContinueDemo1{
	public static void main(String[] args) {
		
		for(int i=1; i<=3;i++){//1 2
			
			for(int j=1;j<=10;j++){//1
				
				if(j>5){
					continue;
				}
				System.out.println(j);//1 2 3 4 5
			}
			
		}
		
	}
}