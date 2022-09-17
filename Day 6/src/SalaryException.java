
public class SalaryException extends Exception {
	String message;
	public SalaryException(int amount) {
		message="Salary Exception Occured";
	}
	@Override
	public String getMessage() {
		// TODO Auto-generated method stub
		System.out.println("Get Message");
		return super.getMessage()+" -message";
	}
	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return "Salary is not according to norms";
	}
	
	
}
