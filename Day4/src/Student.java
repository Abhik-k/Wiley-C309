//has-a kind of relationship
/*Student class Has a Date class*/
public class Student {
	int studentRegNo;
	String studentName;
	Date dtofAdmission;
	
	public Student(int studentRegNo, String studentName, Date dtofAdmission) {
		this.studentRegNo = studentRegNo;
		this.studentName = studentName;
		this.dtofAdmission = dtofAdmission;
	}
	
	public void displayStudent() {
		System.out.println(this.studentRegNo+" "+this.studentName+" "+dtofAdmission.displayDate());
	}
	
	public static void main(String[] args) {
		Date date=new Date(9,9,2022);
		if(date.checkDate()==true) {
		Student student=new Student(101,"Rakesh",date);
		student.displayStudent();
	}
		else {
			System.out.println("Invalid Date Format,Student can not be enrolled");
		}
	}
}
