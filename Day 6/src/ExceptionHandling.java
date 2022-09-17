import java.io.FileNotFoundException;

public class ExceptionHandling {
	
	public static void main(String[] args) {
		int a=2;
		int b=0;
		try {
			int ans=a/b;
		}
		catch(ArithmeticException|NullPointerException e) {
			if(e instanceof ArithmeticException) {
				System.out.println("Arithmetic Exception");
			}
			if(e instanceof NullPointerException)
				System.out.println("Null Pointer Exception");
		}
		catch(Exception e) {
			System.out.println("Exception Class");
		}
		finally {
			System.out.println("Finally Invoked");
		}
		
		int ans=check(3,0);
		System.out.println(ans);
		
		int a2=check(5,2);
		System.out.println(a2);
		
		//throw exception
		int i=10;
		if(i<15) {
			try {
				throw new NullPointerException();
			}
			catch(NullPointerException e) {
				System.out.println("Null Pointer Exception Occured");
			}
		}
		
		
		//throws
		try {
			processFile("data.txt");
		}
		catch(FileNotFoundException e) {
			e.printStackTrace();
			System.out.println("Exception");
		}
	}
		private static void processFile(String file)throws FileNotFoundException{
			System.out.println("Throws Exception");
		}
		
		
		public static int check(int i,int j) {
			int val1,val2;
			try {
				System.out.println("Try execution begin");
				val1=i*j;
				val2=i/j;
				System.out.println("Try execution completed");
				return val1+val2;
			}
			catch(ArithmeticException e) {
				System.out.println("Try execution Thrown Exception");
				System.out.println("Exception Caught by CATCH");
			}
			finally {
				//return 5;
				System.out.println("Finally executed");
			}
			return 5;
		}
}
