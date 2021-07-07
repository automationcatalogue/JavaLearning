package april23rd;

public class BreakDemo {
	public static void main(String[] args) {
		
		for(int i=1;i<=10;i++){
			
			if(i==5){
				break;
			}
			System.out.println(i);
		}
		
	}
}

class BreakDemo1{
	public static void main(String[] args) {
		for(int i=1;i<=3;i++){//i=1 2
			
			for(int j=1;j<=10;j++){//j=
				
				if(j==4){
					break;
				}
				System.out.println(j);//
			}
			
		}
	}
}
