
public abstract class Animal {
	
	abstract void talk();
	
	public void eat() {
		System.out.println("Animal can eat");
	}
	
	public void sleep() {
		System.out.println("Animal can sleep");
	}
	
	public void breath() {
		System.out.println("Animal can Breath");
	}
	
	public Animal doSomething(Animal a) {
		return null;
	}
}
