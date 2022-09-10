
public class EmployeeTest {
	public static void main(String[] args) {
		Employee employee1=new Employee(101, "Abhi");
		Employee employee2=new Employee(102, "Shek");
		Employee employee3=new Employee(103, "MSD");
		Employee employee4=new Employee(104, "Virat");
		Employee employee5=new Employee(105, "Rohit");
		
		System.out.println("Number of employee: "+Employee.getEmployeeCounter());
	}
}
