package programs;

public class PrimeDemo {
	public static void main(String[] args) {
		int k=1, m=13;
		int count=0;
		System.out.println("About to execute prime number logic");
		do{
			if(m%k==0){
				count++;
				System.out.println("If conition is being checked");
			}
			++k;
		}while(k<=m);
		System.out.println("Prim  number code is completed");
		
		if(count==2){
			System.out.println("It is a Prime number");
		}else{
			System.out.println("It is not a prime number, because "+m+" is divisible by "+count+" times");
		}
	}
}
