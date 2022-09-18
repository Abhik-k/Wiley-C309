import java.util.*;
public class ArrayCheck {
	public static void main(String[] args) {
		Scanner in=new Scanner(System.in);
		int N;
		do {
			System.out.println("Enter length of array: ");
			int n=in.nextInt();
			N=n;
			if(n<=5) {
				System.out.println("Array length must be greater than 5");
			}
		}while(N<=5);
		
		int arr[]=new int[N];
		System.out.println("Enter array elements:");
		for(int i=0;i<N;i++) {
			arr[i]=in.nextInt();
		}
		
		if(arr[0]==arr[N-1])
			System.out.println("First and Last element are Same");
		else
			System.out.println("First and Last element are not same");
		
		in.close();
	}
}
