package april23rd;

public class Demo {
	public static void main(String[] args) {
		for(int i=1;i<=10;i++){//1
			
			if(i<5){
				continue;
			}
			
			if(i>5){
				break;
			}
			
			System.out.println(i);//5
		}
	}
}
