package programs;

public class PrimeDemo {
	public static void main(String[] args) {
		int j=1, n=13;
		int countvalue=0;

		while(j<=n) {
			if(n%j==0){
				countvalue++;
			}
			++j;
		}
		
		if(countvalue==2){
			System.out.println("It is a Prime number");
		}else{
			System.out.println("It is not a prime number, because "+n+" is divisible by "+countvalue+" times");
		}
	}
}
