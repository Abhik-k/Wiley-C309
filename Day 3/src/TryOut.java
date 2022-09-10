
public class TryOut {
	public static void main(String[] args) {
		TryOut t=new TryOut();
		
		t.if_else(3, 4);
		t.if_else(5, 5);
		t.if_else(5, 3);
		
		t.switch_case(2);
		t.switch_case(5);
		
		t.for_loop(3);
		t.while_loop(5);
		t.do_while_loop(2);
		
		t.continue_check(5);
	}
	public void if_else(int x,int y) {
		System.out.println("If-Else num1="+x+" num2="+y+"");
		if(x>y) {
			System.out.println(x+" is Greater than "+y);
		}
		else if(x<y) {
			System.out.println(x+" is less than "+y);
		}
		else {
			System.out.println(x+" is Equal to "+y);
		}
		System.out.println();
	}
	
	public void switch_case(int x) {
		System.out.println("Switch case Number="+x);
		switch(x) {
		case 1:
			System.out.println("First Number");
			break;
		case 2:
			System.out.println("Second number");
			break;
		
			default:
				System.out.println("Randome number");
		}
		System.out.println();
	}
	
	public void for_loop(int n) {
		System.out.println("For Loop");
		for(int i=0;i<n;i++) {
			System.out.println("Count: "+i);
		}
		System.out.println();
	}
	
	public void while_loop(int n) {
		System.out.println("While loop - Decrement Number ");
		while(n>0) {
			System.out.print(n+" ");
			n--;
		}
		System.out.println();
	}
	
	public void do_while_loop(int n) {
		System.out.println("Do While Loop");
		do {
			System.out.print(n+" ");
			n--;
		}while(n>0);
		
		System.out.println();
	}
	
	public void continue_check(int n) {
		System.out.println("Continue Check if i=2 continue");
		for(int i=0;i<n;i++) {
			if(i==2)
				continue;
			System.out.println("Count: "+i);
		}
	}
}
