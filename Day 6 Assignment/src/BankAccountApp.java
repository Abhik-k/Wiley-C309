
public class BankAccountApp {
	public static void main(String[] args) {
		BankAccount account1=new BankAccount(121, "Abhi", AccountType.SAVING);
		System.out.println(account1);
		account1.calculateTotalInterest(1500, 2);
		
		System.out.println("************************************");
		
		BankAccount account2=new BankAccount(152, "Kumar", AccountType.CURRENT);
		System.out.println(account2);
		account2.calculateTotalInterest(9800, 3);
		
		System.out.println("************************************");
		
		BankAccount account3=new BankAccount(132, "Arora", AccountType.SAVING);
		System.out.println(account3);
		account3.calculateTotalInterest(-850, 2);
	}
}
