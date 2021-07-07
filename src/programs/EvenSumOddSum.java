package programs;

public class EvenSumOddSum {
	public static void main(String[] args) {
		int i=3, evensum=0, oddsum=0;
		do{
			
			if(i%2==0){
				evensum=evensum+i;
			}else{
				oddsum=oddsum+i;
			}
			i++;
		}while(i<=14);
		System.out.println("Evensum value is :"+evensum+" Oddsum value is :"+oddsum);
	}
}
