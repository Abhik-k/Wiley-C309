
public class ReverseString {
	public static String reverseString1(String str) {
		//Using StringBuilder
		StringBuilder sb= new StringBuilder(str);
		String st =new String(sb.reverse());
		return st;
	}
	public static String reverseString2(String str) {
		String st="";
		for(int i=0;i<str.length();i++) {
			char ch=str.charAt(i);
			st=ch+st;
		}
		return st;
	}
	public static void main(String[] args) {
		String s1="Hello";
		System.out.println("Reverse Using StringBuilder: "+reverseString1(s1));
		
		String s2="World";
		System.out.println("Reverse using loop: "+reverseString2(s2));
		
		String s3="Hello World!!";
		System.out.println("Reverse Using StringBuilder: "+reverseString1(s3));
		System.out.println("Reverse using loop: "+reverseString2(s3));
	}
}
