//Using Enum
public class BankAccount2 {
	private int accountId;
	private String accountHolderName;
	private double openingBalance;
	private double currentBalance;
	private static double totalBalance;
	
	AccountType accountType;
	
	public BankAccount2() {
		// TODO Auto-generated constructor stub
	}

	public BankAccount2(int accountId, String accountHolderName, double currentBalance, AccountType accountType) {
		
		System.out.println("--------New Account Created----------\nAccountInformation: ");
		//System.out.println("Account ID: "+accountId+" | Account Holder Name: "+accountHolderName+" | Account Type: "+accountType+" | "+currentBalance+" was added to the account");
		
		if(accountType == AccountType.CURRENT) {
			openingBalance=1000;
		}
		if(accountType == AccountType.SAVING) {
			openingBalance=500;
		}
		this.accountId = accountId;
		this.accountHolderName = accountHolderName;
		this.currentBalance = currentBalance;
		totalBalance=currentBalance+openingBalance;
		this.accountType = accountType;
	}

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

	public AccountType getAccountType() {
		return accountType;
	}

	public void setAccountType(AccountType accountType) {
		this.accountType = accountType;
	}
	
	public void depositAmount(double amount) {
		if (amount < 0)
			System.out.println("ERROR: Cannot deposit amount, deposit amount cannot be less than 0");
		else {
			currentBalance += amount;
			totalBalance += amount;
			System.out.println("Amount deposited: " + amount + " Current Balance: " + currentBalance
					+ " | Old balance was: " + (currentBalance - amount));
		}
	}

	public void withdrawAmount(double amount) {
		if (amount > currentBalance)
			System.out.println(
					"ERROR: Cannot withdraw amount, insufficient balance, available balance: " + currentBalance);
		else {
			double temp = currentBalance;
			currentBalance -= amount;
			totalBalance -= amount;
			System.out.println("Amount withdrawn: " + amount + " Current Balance: " + currentBalance
					+ " | Old balance was: " + (temp));
		}
	}
	
	public static void displayTotalBalance() {
		System.out.println("Total balance in the bank: " + totalBalance);
	}
	
	public void getAccountInfo() {
		System.out.println("Account ID: " + accountId + " | Account Name: " + accountHolderName + " | Account Type: "
				+ accountType +"| Opening Balance: "+openingBalance + " | Current Balance: " + currentBalance+" | TotalBalance: "+totalBalance);
	}
	
}
