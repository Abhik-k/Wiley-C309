/*9.	Create the Employee class, which should contain the attributes empId, empName.
 *  Along with that, it should also contain empAddresses, which is array of address. 
 *  This should consist of temporary address and permanent address. 
Write a program to instantiate the employee object and display all the attributes of the same.
Attributes of address class: flatNumber, flatName, roadName, cityName. 
*/
public class Employee {
	private int empId;
	private String empName;
	private EmpAddress empAddress[];
	
	public Employee(int empId, String empName, EmpAddress[] empAddress) {
		this.empId = empId;
		this.empName = empName;
		this.empAddress = empAddress;
	}
	
	public void displayEmployee() {
		System.out.println("EmpId: "+empId+" | "+"EmpName: "+empName+" | EmpAddress:");
		getEmpAddress();
	}

	private void getEmpAddress() {
		int i=0;
		for(EmpAddress e:empAddress) {
			if(i==0)
				System.out.println("Temproary Address: "+e.getFlatNumber()+"/"+e.getFlatName()+"/"+e.getRoadName()+"/"+e.getCityName());
			else
				System.out.println("Permanent Address: "+e.getFlatNumber()+"/"+e.getFlatName()+"/"+e.getRoadName()+"/"+e.getCityName());
			i++;
		}
	}
}
