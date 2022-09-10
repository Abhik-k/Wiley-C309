
public class AnimalApp {
public static void main(String[] args) {
	Animal animal=new Dog();
	animal.talk();
//	animal.read();//Error
	
	((Dog)animal).walk();//downcasting
	
	((Dog)animal).read();
	}
}
