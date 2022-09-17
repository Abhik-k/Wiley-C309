
public class Practice {
	public static void main(String[] args) {
		
		String str="ABC";
		String s=new String("ABC");
		String ss=new String("ABC");
		String b="ABC";
		System.out.println("********Before************");
		System.out.println(str+"-"+str.hashCode());
		System.out.println(s+"-"+s.hashCode());
		System.out.println(b+"-"+b.hashCode());
		System.out.println(ss+"-"+ss.hashCode());
		
		if(str == b)
			System.out.println("true");
		else System.out.println("false");
		
		if(str == s)
			System.out.println("true");
		else 
			System.out.println("false");
		
		if(s == ss)
			System.out.println("true");
		else 
			System.out.println("false");
		
		str=str+"ac";
		s=s+"c";
		b=b+"d";
		
		System.out.println("**********After************");
		System.out.println(str+"-"+str.hashCode());
		System.out.println(s+"-"+s.hashCode());
		System.out.println(b+"-"+b.hashCode());
		
		String s1="ab";
		String s2="ab";
		System.out.println(s1.hashCode());
		System.out.println(s2.hashCode());
		
		if(s1==s2)
			System.out.println("True");
		else
			System.out.println("False");
		
		s2=s2.charAt(0)+"b";
		System.out.println(s2.hashCode());
		System.out.println(s2);
		
		if(s1.equals(s2))
			System.out.println("True");
		else
			System.out.println("False");
		
		
		System.out.println("***************************");
		
		StringBuffer sb =new StringBuffer("abc");
		System.out.println(sb);
		sb.toString();
		
		StringBuilder sr=new StringBuilder("abc");
		System.out.println(sr);
		
		String loc=new String("Jamshedpur");
		String loc2=loc;
		if(loc==loc2)
			System.out.println("Yes LOC");
		else
			System.out.println("No LOC");
		
		
		String str1="Hello";
		String str2="Hello";
		String str3=str1;
		System.out.println(str1+","+str2+","+str3);
		str1=str1+" Buddy";
		System.out.println(str1+","+str2+","+str3);
	}

	@Override
	public int hashCode() {
		// TODO Auto-generated method stub
		return super.hashCode();
	}
}
