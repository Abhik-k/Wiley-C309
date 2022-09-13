
public class Student implements Cloneable{
	private String name;
	private int roll_no;
	public Student() {
		// TODO Auto-generated constructor stub
	}
	public Student(String name, int roll_no) {
		this.name = name;
		this.roll_no = roll_no;	
	}
	
	//Copy Constructor
	public Student(Student student) {
		this.name=student.getName();
		this.roll_no=student.getRoll_no();
	}
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getRoll_no() {
		return roll_no;
	}
	public void setRoll_no(int roll_no) {
		this.roll_no = roll_no;
	}
	@Override
	public int hashCode() {
		// TODO Auto-generated method stub
		return super.hashCode();
	}
	@Override
	public boolean equals(Object obj) {
		// TODO Auto-generated method stub
		//return super.equals(obj);
		Student student=(Student)obj;
		if(this.name == student.name && this.roll_no == student.roll_no)
			return true;
		return false;
	}
	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return this.name+" "+this.roll_no;
	}
	@Override
	protected Object clone() throws CloneNotSupportedException {
		// TODO Auto-generated method stub
		return (Student)super.clone();
	}
	
	public Student clone2() {
		Student newStudent= new Student(this.getName(),this.getRoll_no());
		return newStudent;
	}
	
	public Student getClone() throws CloneNotSupportedException{
		System.out.println("Clone Created!!");
		return (Student)this.clone();
	}
	
}
