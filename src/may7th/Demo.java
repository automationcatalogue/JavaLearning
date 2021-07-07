package may7th;

public class Demo {
	
	//static int sum=0;
	
	public static void main(String[] args) {
		
		int a[]={45, 78,3,5,9};
		
		Demo ob = new Demo();
		
		
		int z=ob.sumArray(a);
		z=z*10;
		System.out.println("Value of z is :"+z);
		
		int d[]={4,7,9,10};
		
		ob.sumArray(d);

		
	}
	
	int sumArray(int x[]){ //methods with return type and with arguments
							//Instance methods
							//int x[] =a[];
		
		int sum=0;
		for(int i=0;i<=x.length-1;i++){
			sum=sum+x[i];
		}
		
		System.out.println("Sum of the array is :"+sum);
		return sum;
	}
	
}
