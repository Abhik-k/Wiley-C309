/*8.	Modify the above BankAccount class by connecting it with DepositAmountException. 
 * This exception should be generated if the amount passed in the calculateTotalInterest is not positive. */

public class DepositeAmountException extends Exception{
	String message;
	
	public DepositeAmountException(double amount) {
		if(amount<0)
			message="Amount entered is Invalid, Amount should be greater than 0";
	}

	@Override
	public String getMessage() {
		// TODO Auto-generated method stub
		return "Cann't Calculate Interest";
	}

	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return message;
	}
	
	
}
