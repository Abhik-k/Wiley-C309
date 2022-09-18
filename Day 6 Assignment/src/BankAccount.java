/*7.	Create the BankAccount with the following details: 
Attributes: accountId, accountHolderName, AccountType;
AccountType be enum contains the types SAVINGS and CURRENT. 
The enum Should also provide the default interest rate for SAVINGS and CURRENT account.
That should be returned from one of the methods from the enum 
Behaviour: BankAccount should have the method, calculateTotalInterest as shown below:
			calculateTotalInterest(double amount, int years)
	The main class should create object of BankAccount and provide the accounttype.
 It should 	later invoke the calculateTotalInterest() by providing arguments. Print the total interest on 	investments. 
*/
public class BankAccount {
	private int accountId;
	private String accountHolderName;
	AccountType accountType;
	public BankAccount() {
		// TODO Auto-generated constructor stub
	}
	public BankAccount(int accountId, String accountHolderName, AccountType accountType) {
		this.accountId = accountId;
		this.accountHolderName = accountHolderName;
		this.accountType = accountType;
	}
	
	public void calculateTotalInterest(double amount,int years) {
		try {
			if(amount<0)
				throw new DepositeAmountException(amount);
			int ir;
			ir=accountType.getInterestRate();
			double totalInterest;
			totalInterest=(amount*ir*years)/100;
			System.out.println("Total Interest on Investment: "+totalInterest);
		}
		catch(DepositeAmountException de) {
			System.out.println(de);
			System.out.println(de.getMessage());
		}
	}
	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return "AccountId : "+this.accountId+" | AccountHolderName : "+this.accountHolderName+" | AccountType : "+accountType+" | InterestRate : "+accountType.getInterestRate();
	}
	
	
}
