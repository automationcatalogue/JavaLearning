package programs;


public class AverageDemo {
	public static void main(String[] args) {
		int english =90, maths=42, science=30, social=75;
		float avg=(english+maths+science+social)/4;
		System.out.println("Average is :"+avg);
		
		boolean flag=english<=30 ||maths<=30 ||science<=30 || social<=30;

		if(flag && avg>=70){
			System.out.println("First class with Distinction...");
		}else if(flag && avg<70 && avg>=60){
			System.out.println("First class");
		}else if(flag && avg<60 && avg>=50){
			System.out.println("Second class");
		}else if(flag && avg<50 && avg>=40){
			System.out.println("Tird class");
		}else if(flag && avg<40){
			System.out.println("Failed");
		}
	}
}
