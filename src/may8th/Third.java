package may8th;

public class Third {
	public static void main(String[] args) {
		Emp2 e1 = new Emp2();
		Emp2 e2 = new Emp2();
		
		e1.set(101, 50000.00f);
		e2.set(102, 60000.00f);
		
		System.out.println(e1.empNo+"\t"+e1.empSalary);
		System.out.println(e2.empNo+"\t"+e2.empSalary);
	}
}
