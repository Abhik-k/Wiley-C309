
public class BankAccount {
	private int accountId;
	private String accountHolderName;
	private double openingBalance,currentBalance,totalBalance;
	
	public int getAccountId() {
		return accountId;
	}
	public void setAccountId(int accountId) {
		this.accountId = accountId;
	}
	public String getAccountHolderName() {
		return accountHolderName;
	}
	public void setAccountHolderName(String accountHolderName) {
		this.accountHolderName = accountHolderName;
	}
	public double getOpeningBalance() {
		return openingBalance;
	}

	public void setOpeningBalance(double openingBalance) {
		this.openingBalance = openingBalance;
	}

	public double getCurrentBalance() {
		return currentBalance;
	}
	public void setCurrentBalance(double currentBalance) {
		this.currentBalance = currentBalance;
	}
	

	public double getTotalBalance() {
		return totalBalance;
	}
	
	public void setTotalBalance(double totalBalance) {
		this.totalBalance = totalBalance;
	}
	public BankAccount() {
	// TODO Auto-generated constructor stub
	}
	
	
	public BankAccount(int accountId, String accountHolderName, double openingBalance, double currentBalance) {
		this.accountId = accountId;
		this.accountHolderName = accountHolderName;
		this.openingBalance = openingBalance;
		this.currentBalance = currentBalance;
	}

	public void depositAmount(double amount) {
		System.out.println("Amount to Deposite: "+amount);
		double balance=0;
		if(amount>0) {
			balance=getCurrentBalance()+amount;
			setCurrentBalance(balance);
		}
		else {
			System.out.println("Invalid deposite amount");
		}
	}
	
	public void withdrawAmount(double amount) {
		double balance=0;
		if(getCurrentBalance()>0 && amount<getCurrentBalance()) {
			System.out.println("Amount Withdrawn: "+amount);
			balance=getCurrentBalance()-amount;
			setCurrentBalance(balance);
		}
		else {
			System.out.println("invalid Amount");
		}
	}
	
	public void displayTotalBalance() {
		double balance=getCurrentBalance()+getOpeningBalance();
		setTotalBalance(balance);
		System.out.println("Current Balance: "+getCurrentBalance());
		System.out.println("Total Balance: "+getTotalBalance());
	}
	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return "[EmpId- "+getAccountId()+", EmpName- "+getAccountHolderName()+", Current Balance- "+getCurrentBalance()+", Total Balance- "+getTotalBalance()+"]";
	}
	
	
}
