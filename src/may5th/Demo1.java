package may5th;

public class Demo1 {
	
	static int addArrayData(){//methods without arguments and with return type
		int a[]={45,5,7,9,3,4};
		int sum=0;
		
		for(int i=0;i<=a.length-1;i++){
			sum=sum+a[i];
		}
		
		
		return 500;
	}
	
	
	public static void main(String[] args) { 
		int x=addArrayData();
		System.out.println("Addition of array data is :"+x);
		
		getMax(35, x);
		
	}
	
	static void addNumbers(int a, int b){ //method with arguments and without return type
		int c= a+b;
		System.out.println("Addition of a,b is :"+c);
		
		getMax(a, b);//method call statement
	}
	
	static void getMax(int x, int y){//method with arguments and without return type
		if(x>y){
			System.out.println("X is greater value :"+x);
		}else if(x<y){
			System.out.println("Y is greater value :"+y);
		}else{
			System.out.println("Both X&Y values are same :"+x);
		}
	}
}
