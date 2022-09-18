
public class EmployeeApp {
	public static void main(String[] args) {
		EmpAddress tempAdd=new EmpAddress(4, "Villa", "JP Road", "JSR");
		EmpAddress permAdd=new EmpAddress(14, "Mahal", "Jug", "Vizag");
		EmpAddress address[]=new EmpAddress[] {tempAdd,permAdd};
		Employee employee=new Employee(121, "Abhi", address);
		employee.displayEmployee();
		
		System.out.println("****************************");
		EmpAddress tempAdd2=new EmpAddress(32, "Apex", "Vk Street", "Wiley");
		EmpAddress permAdd2=new EmpAddress(11, "Taj", "Thomas Street", "Mum");
		EmpAddress address2[]=new EmpAddress[] {tempAdd2,permAdd2};
		Employee employee2=new Employee(128, "Kumar", address2);
		employee2.displayEmployee();
	}
}
