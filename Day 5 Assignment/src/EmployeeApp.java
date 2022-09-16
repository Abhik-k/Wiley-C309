
public class EmployeeApp {
	public static void main(String[] args) {
		Employee[] empArray=new Employee[5];
		empArray[0]= new Employee(121, "Abhi", "CS", 12000);
		empArray[1]= new Employee(122, "Virat", "CS", 15000);
		empArray[2]= new Employee(123, "Mahi", "WK", 17000);
		empArray[3]= new Employee(124, "Rohit", "V.Cap", 12500);
		empArray[4]= new Employee(125, "Hardik", "WK", 12030);
		
		System.out.println("******************************************************");
		System.out.println("Employee Details:- ");
		for(Employee employee:empArray) {
			employee.calculateGrossSalary();
			System.out.println(employee);
		}
		
//		System.out.println(empArray[1].getEmpBasicSalary());
		
		sortEmployees(empArray);
		
		searchEmployee(empArray, "CS");
		
		//Problem 2:
		Employee e1=new Employee(101, "ABC", "XY", 999);
		Employee e2=new Employee(101, "ABC", "UV", 1549);
		Employee e3=new Employee(105, "TUV", "MN", 1799);
		
		if(e1.equals(e2)) {
			System.out.println("Object E1 and E2 have same EmpID & EmpName");
		}
		else {
			System.out.println("Object E1 and E2 don't have same EmpID & EmpName");
		}
		
		if(e1.equals(e3)) {
			System.out.println("Object E1 and E3 have same EmpID & EmpName");
		}
		else {
			System.out.println("Object E1 and E3 don't have same EmpID & EmpName");
		}
	}
	
	public static void sortEmployees(Employee[] empArray) {
		System.out.println("Employee details after Sorting on basis of Salary:-");
		for(int i=0;i<empArray.length-1;i++) {
			for(int j=0;j<empArray.length-i-1;j++) {
				if(empArray[j].getEmpGrossSalary() > empArray[j+1].getEmpGrossSalary()) {
					Employee e=empArray[j];
					empArray[j]=empArray[j+1];
					empArray[j+1]=e;
				}
			}
		}
		System.out.println("***************************************************************");
		//Bubble Sort
		//Sort Employee Array on basis of Salary
	
		
		for(Employee employee:empArray) {
			employee.calculateGrossSalary();
			System.out.println(employee);
		}
		
		
		System.out.println("***************************************************************");
	}
	
	public static void searchEmployee(Employee[] empArray,String dept) {
		for(int i=0;i<empArray.length;i++) {
			if(empArray[i].getEmpDept().equals(dept)) {
				System.out.println(empArray[i]);
			}
		}
	}
}
