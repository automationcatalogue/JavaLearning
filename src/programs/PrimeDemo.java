package programs;

public class PrimeDemo {
	public static void main(String[] args) {
		int i=1, n=13;
		int count=0;
		do{
			if(n%i==0){
				count++;
			}
			++i;
		}while(i<=n);
		
		if(count==2){
			System.out.println("It is a Prime number");
		}else{
			System.out.println("It is not a prime number, because "+n+" is divisible by "+count+" times");
		}
	}
}
