
public class EmployeeApp {
	public static void main(String[] args) throws CloneNotSupportedException {
		
		Employee employee1=new Employee(101,"AB");
		//Implementation of toString() method:
		System.out.println("Implementation of toString() method:");
		System.out.println(employee1);
		
		Employee employee2 =employee1;
		
		System.out.println("Use of == :");
		if(employee1==employee2)
			System.out.println("Objects are same");
		else
			System.out.println("Obects are different");
		
		Employee employee3 = new Employee(101,"AB");
		Employee employee4=new Employee(102,"CD");
		
		//Implementation of equals() method:
		System.out.println("Equals method");
		if(employee1.equals(employee3)) {
			System.out.println("Objects are same");
		}
		else {
			System.out.println("Object are different");
		}
		
		//Implementation of hashCode() method:
		System.out.println("HashCode");
		System.out.println(employee1.hashCode());
		System.out.println(employee2.hashCode());
		System.out.println(employee3.hashCode());
		
		//Using Clone
		System.out.println("Using Clone");
		Employee employee5 = (Employee)employee3.clone();
		System.out.println(employee5);
	}
}
