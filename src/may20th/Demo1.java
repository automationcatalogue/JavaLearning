package may20th;

public class Demo1 {
	public static void main(String[] args) {
		Person ob =new Person();
		
		ob.setAge(35);
		int x=ob.getAge();
		System.out.println("Age value is :"+x);
		
		ob.setAge(-20);	
		x=ob.getAge();
		System.out.println("Age value is :"+x);
	}
}
