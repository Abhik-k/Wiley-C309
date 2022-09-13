
public class Employee implements Cloneable{
	private int empId;
	private String empName;
	
	public Employee() {
		// TODO Auto-generated constructor stub
	}
	
	public Employee(int empId, String empName) {
		this.empId = empId;
		this.empName = empName;
	}
	
	//Implementation of toString() method:
	@Override
	public String toString() {
		
		return this.empId+" "+this.empName;
	}

	//Implementation of equals() method:
	@Override
	public boolean equals(Object obj) {
		Employee e= (Employee)obj;
		if(this.empId==e.empId)
			return true;
		return false;
	}

	@Override
	public int hashCode() {
		// TODO Auto-generated method stub
		//return super.hashCode();
		return this.empId*8;
	}

	@Override
	protected Object clone() throws CloneNotSupportedException {
		// TODO Auto-generated method stub
		return super.clone();
	}
	
	
	
}
