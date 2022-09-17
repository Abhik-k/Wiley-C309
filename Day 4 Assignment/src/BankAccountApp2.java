
public class BankAccountApp2 {
	public static void main(String[] args) {
		BankAccount2 b1=new BankAccount2(121, "Abhi", 5000, AccountType.SAVING);
		b1.getAccountInfo();
		b1.withdrawAmount(250);
		b1.depositAmount(300);
		System.out.println("\n**********************\n");
		
		BankAccount2 b2=new BankAccount2(122, "Shek", 1500, AccountType.CURRENT);
		b2.getAccountInfo();
		b2.withdrawAmount(150);
		b2.depositAmount(600);
		BankAccount2.displayTotalBalance();
		System.out.println("\n**********************\n");
		
		BankAccount2 b3=new BankAccount2(122, "VK", 3500, AccountType.CURRENT);
		b3.getAccountInfo();
		b3.withdrawAmount(1990);
		b3.depositAmount(2600);
		BankAccount2.displayTotalBalance();
		System.out.println("\n**********************\n");
	}
}
