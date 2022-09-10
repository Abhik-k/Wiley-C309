import java.util.ArrayList;
public class Fibonacci {
	int n;
	ArrayList<Integer> list=new ArrayList<Integer>();
	
	public Fibonacci() {
		this.n=5;
		this.list=null;
	}
	public Fibonacci(int n) {
		this.n=n;
		this.list=null;
	}
	
	public void fib() {
		int a=0,b=1;
		int c;
		System.out.print(0+" ");
		System.out.print(1+" ");
		while(n>1) {
			c=a+b;
			System.out.print(c+" ");
			a=b;
			b=c;
			n--;
		}
		System.out.println();
	}
}
