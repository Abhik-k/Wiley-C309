
public class Employee {
	
	private int empId;
	private String empName;
	private String empDept;
	private double empBasicSalary,empGrossSalary;
	
	
	
	public Employee() {
	// TODO Auto-generated constructor stub
	}

	
	public int getEmpId() {
		return empId;
	}


	public void setEmpId(int empId) {
		this.empId = empId;
	}


	public String getEmpName() {
		return empName;
	}


	public void setEmpName(String empName) {
		this.empName = empName;
	}


	public String getEmpDept() {
		return empDept;
	}


	public void setEmpDept(String empDept) {
		this.empDept = empDept;
	}


	public double getEmpBasicSalary() {
		return empBasicSalary;
	}


	public void setEmpBasicSalary(double empBasicSalary) {
		this.empBasicSalary = empBasicSalary;
	}


	public double getEmpGrossSalary() {
		return empGrossSalary;
	}


	public void setEmpGrossSalary(double empGrossSalary) {
		this.empGrossSalary = empGrossSalary;
	}


	public Employee(int empId, String empName, String empDept, double empBasicSalary) {
		this.empId = empId;
		this.empName = empName;
		this.empDept = empDept;
		this.empBasicSalary = empBasicSalary;
	}
	
	public double calculateGrossSalary() {
		double grossSalary=0;
		double hra = getEmpBasicSalary()*0.12;
		double da=	getEmpBasicSalary()*0.8;
		
		grossSalary=getEmpBasicSalary()+hra+da;
		setEmpGrossSalary(grossSalary);
		return grossSalary;
	}

//	public Employee[] sortEmployee(Employee[] empArray) {
//		for(int i=0;i<empArray.length-1;i++) {
//			for(int j=0;j<empArray.length-i-1;j++) {
//				if(empArray[j].getEmpBasicSalary() > empArray[j+1].getEmpBasicSalary()) {
//					Employee e=empArray[j];
//					empArray[j]=empArray[j+1];
//					empArray[j+1]=e;
//				}
//			}
//		}
//		return empArray;
//	}
	
	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return "[EmpId-"+getEmpId()+", EmpName-"+getEmpName()+", EmpDept-"+getEmpDept()+", EmpBasicSalary-"+getEmpBasicSalary()+", EmpGrossSalary-"+getEmpGrossSalary()+"]";
	}


	@Override
	public boolean equals(Object obj) {
		// Downcasting
		Employee e=(Employee)obj;
		if(this.empId == e.empId && this.empName == e.empName) {
			return true;
		}
		return false;
	}
	
//	public Employee[] sortEmployees(Employee[] empArray) {
//		System.out.println("Employee details after Sorting on basis of Salary:-");
//		for(int i=0;i<empArray.length-1;i++) {
//			for(int j=0;j<empArray.length-i-1;j++) {
//				if(empArray[j].getEmpGrossSalary() > empArray[j+1].getEmpGrossSalary()) {
//					Employee e=empArray[j];
//					empArray[j]=empArray[j+1];
//					empArray[j+1]=e;
//				}
//			}
//		}
//		return empArray;
//	}

}
