
public class Dog extends Animal {

		public void talk() {
			System.out.println("Dog Barks!!");
		}
		
		public void walk() {
			System.out.println("Dog can Walk!!");
		}
		public void read() {
			System.out.println("My Dog can read!!");
		}
		
		@Override
		public Dog doSomething(Animal a) {
			//do something for dog
			//Return type can be covariant i.e subtype
			return null;
		}
		
}
