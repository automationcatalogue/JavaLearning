package may8th;

public class Second {
	public static void main(String[] args) {
		Emp1 e1 = new Emp1(101, 50000.00f);
		Emp1 e2 = new Emp1(102, 60000.00f);
		
		System.out.println(e1.empNo+"\t"+e1.empSalary);
		System.out.println(e2.empNo+"\t"+e2.empSalary);
	}
}
