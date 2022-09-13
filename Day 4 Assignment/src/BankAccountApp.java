
public class BankAccountApp {
	public static void main(String[] args) {
		System.out.println("***************************************************************");
		BankAccount ba1=new BankAccount(121,"Abhi",20,300);
		System.out.println("Opening Balance: "+ba1.getOpeningBalance());
		ba1.displayTotalBalance();
		ba1.withdrawAmount(250);
		ba1.displayTotalBalance();
		ba1.depositAmount(100);
		ba1.displayTotalBalance();
		System.out.println(ba1);
		
		System.out.println("***************************************************************");
		
		BankAccount ba2=new BankAccount(123, "Shek", 250, 400);
		ba2.withdrawAmount(150);
		ba2.displayTotalBalance();
		ba2.depositAmount(300);
		ba2.displayTotalBalance();
		System.out.println(ba2);
		
		System.out.println("***************************************************************");
		
		BankAccount ba3=new BankAccount(122,"Kumar",200,3000);
		System.out.println("Opening Balance: "+ba3.getOpeningBalance());
		ba3.displayTotalBalance();
		ba3.withdrawAmount(1250);
		ba3.displayTotalBalance();
		ba3.depositAmount(1020);
		ba3.displayTotalBalance();
		System.out.println(ba3);
	}
}
