
public enum AccountType {
	SAVING(10),CURRENT(15);
	
	private int intersetRate;
	
	private AccountType(int interestRate) {
		this.intersetRate=interestRate;
	}
	
	public int getInterestRate() {
		return this.intersetRate;
	}
}
