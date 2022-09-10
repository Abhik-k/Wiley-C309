//static variable
public class Employee {
	static int empCounter;
	int empID;
	String empName;
	
	public Employee() {
		// TODO Auto-generated constructor stub
	}
	
	//static block
	static {
		empCounter=100;
	}
	
	public Employee(int empID, String empName) {
		this.empID = empID;
		this.empName = empName;
		System.out.println("Employee created . Counter will increase by 1!");
		empCounter++;
	}
	
	public static int getEmployeeCounter() {
		return empCounter;
	}
}
