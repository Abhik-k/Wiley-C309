
public class GarbageDemo1 {
	public static void main(String[] args) {
		GarbageDemo1 s1= new GarbageDemo1();
		GarbageDemo1 s2= new GarbageDemo1();
		s1=null;
		s2=null;
		String s4="java";
		System.out.println(s4);
		System.gc();
		System.out.println(s4);
		
		System.gc();
		
		System.out.println(s4);
		display(s4);
	}
	public static void display(String s5) {
		String s3="something";
		s3=null;
		s5=null;
		System.gc();
	}
	@Override
	protected void finalize() throws Throwable {
		// TODO Auto-generated method stub
		System.out.println("Object is garbage Collected");
	}
	
}
