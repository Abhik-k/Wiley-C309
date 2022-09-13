
public class StudentApp {
	public static void main(String[] args) throws CloneNotSupportedException {
		
		Student student1=new Student("Abhi", 121);
		System.out.println(student1.getName());
		System.out.println(student1.getRoll_no());
		System.out.println(student1);
		System.out.println(student1.hashCode());
		
		Student student2=new Student("Kumar", 123);
		System.out.println(student2.getName());
		System.out.println(student2.getRoll_no());
		System.out.println(student2);
		System.out.println(student2.hashCode());
		
		System.out.println(student1.equals(student2));
		
		//Deep Copying with Clone
		Student student3=(Student)student1.clone();
		System.out.println(student3.getName());
		System.out.println(student3.getRoll_no());
		System.out.println(student3);
		System.out.println(student3.hashCode());
		
		student3.setName("Ram");
		student3.setRoll_no(101);
		
		System.out.println(student3);
		System.out.println(student1);
		
		if(student3 == student1) {
			System.out.println("YES");
		}
		else {
			System.out.println("NO");
		}
		//Shallow Copying
		Student student4=student2;
		System.out.println(student4);
		System.out.println(student2.hashCode());
		System.out.println(student4.hashCode());
		
		student4.setName("Sita");
		student4.setRoll_no(45);
		
		System.out.println(student2+" "+student4);
		if(student4 == student2) {
			System.out.println("YES");
		}
		else {
			System.out.println("NO");
		}
		
		if(student4.hashCode() == student2.hashCode()) {
			System.out.println("YES");
		}
		else {
			System.out.println("NO");
		}
		
		//Deep Copying without clone by creating a method in Student class
		Student student5=student2.clone2();
		System.out.println(student5.getName());
		System.out.println(student5.getRoll_no());
		System.out.println(student5);
		System.out.println(student5.hashCode());
		
		student5.setName("Radhe");
		student5.setRoll_no(159);
		System.out.println(student2+" - "+student5);
		
		if(student5 == student2) {
			System.out.println("YES");
		}
		else {
			System.out.println("NO");
		}
		
		if(student5.hashCode() == student2.hashCode()) {
			System.out.println("YES");
		}
		else {
			System.out.println("NO");
		}
		
		 //Copy Constructor for Cloning - Deep Copying
		Student student6 =new Student(student1);
		System.out.println(student6.getName());
		System.out.println(student6.getRoll_no());
		System.out.println(student6);
		System.out.println(student6.hashCode());
		
		student6.setName("Shyam");
		System.out.println(student1.getName());
		System.out.println(student6.getName());
		
		
		if(student6 == student1)
			System.out.println("Yes");
		
		else
			System.out.println("No");
		
		if(student6.hashCode() == student1.hashCode())
			System.out.println("Yes");
		
		else
			System.out.println("No");
		
		//Prototype Design Pattern
		//Deep copy with clone
		
		Student student7=student6.getClone();
		System.out.println(student7.getName());
		System.out.println(student7.getRoll_no());
		System.out.println(student7);
		System.out.println(student7.hashCode());
		
		student7.setName("HP");
		System.out.println(student6.getName()+" - "+student7.getName());
		
		
		//Wrapper Class
		Integer integer1=new Integer(5);
		System.out.println(integer1);
		
		if(integer1.equals(5))
			System.out.println("Yes");
		
		int a=integer1.intValue();
		System.out.println(a);
		
		System.out.println(Integer.valueOf(a));
		System.out.println(Integer.toBinaryString(a));
		System.out.println(Integer.toBinaryString(2+a));
	}
}
