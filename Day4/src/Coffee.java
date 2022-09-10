//Enum
public enum Coffee {
	NESCAFE(5),LATTE(7),CAPACHINO(12),DALGONA(8);
	private int coffeebeans;
	private double cost;
	
	private Coffee(int coffeebeans) {
		this.coffeebeans=coffeebeans;
	}
	public void prepareCoffee() {
		System.out.println("Your Coffee is getting prepared");
	}
	
	public double calculateCost() {
		return this.coffeebeans*20;
	}
}

