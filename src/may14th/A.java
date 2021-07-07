package may14th;

public class A {
	//method definition
	//Instance method
	//method with arguments and without return type
	
	void addArray(int x[]){
		int sum=0;
		for(int y:x){
			sum=sum+y;
		}
		System.out.println("Addition of the Array :"+sum);
	}
	
	void print(){
		int x=8;
		if(x%2==0){
			System.out.println("Even number!!!");
		}else{
			System.out.println("Odd number");
		}
	}
}
