
public class EmployeeCall {
	public static void main(String[] args) {
		Employee employee1=new Employee();
		System.out.println(employee1.empId +" "+employee1.empName);
		
		Employee employee2=new Employee(2,"Abhi");
		System.out.println(employee2.empId+" "+employee2.empName);
		
		Employee employee3=new Employee(3,"Shek",'M');
		System.out.println(employee3.empId+" "+employee3.empName+" "+employee3.empGender);
	}
}
