
public class SalaryExceptionDemo {
	public static void main(String[] args) {
		
		try {
			calculateGrossSalary(5000);
		}
		catch(SalaryException se) {
			System.out.println(se);
			System.out.println(se.getMessage());
		}
	}
	
	private static void calculateGrossSalary(int basicSalary)throws SalaryException {
		if(basicSalary<8000)
			throw new SalaryException(80);
	}
}
