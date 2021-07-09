package programs;

public class PrimeDemo {
	public static void main(String[] args) {
		int k=1, m=13;
		System.out.println("About to execute prime number logic");
		
		int countvalue=0;

		while(k<=m) {
			if(m%k==0){
				countvalue++;

			}
			++k;
		}
		System.out.println("Prim  number code is completed");
		
		if(countvalue==2){
			System.out.println("It is a Prime number");
		}else{
			System.out.println("It is not a prime number, because "+m+" is divisible by "+countvalue+" times");

		}
	}
}
