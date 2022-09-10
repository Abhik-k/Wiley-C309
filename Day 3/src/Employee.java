
public class Employee {
	int empId;
	String empName;
	char empGender;
	
	//Default Constructor
	public Employee() {
		empId=1;
		empName="Ab";
	}
	
	//Parameterized Constructor without using this keyword
	public Employee(int _empId,String _empName) {
		empId=_empId;
		empName=_empName;
	}
	
	//Parameterized Constructor with using this keyword
	public Employee(int empId,String empName,char empGender) {
		this.empId=empId;
		this.empName=empName;
		this.empGender=empGender;
	}
}
