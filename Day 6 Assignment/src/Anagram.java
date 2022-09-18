
public class Anagram {
	public static void main(String[] args) {
		String s1="Triangle";
		String s2="Integral";
		checkAnagram(s1,s2);
		
		checkAnagram("Race","Care");
		
		checkAnagram("allergy", "allergic");
		
		
}

	private static void checkAnagram(String s1, String s2) {
		// TODO Auto-generated method stub
		String st1=s1;
		String st2=s2;
		s1=s1.toLowerCase();
		s2=s2.toLowerCase();
		
		s1=s1.replaceAll(" ", "");
		s2=s2.replaceAll(" ", "");
		
		int count[]=new int[26];
		
		if(s1.length()!=s2.length()) {
			System.out.println("Given String "+st1+", "+st2+" are not Anagram");
			return;
		}
		
		for(int i=0;i<s1.length();i++) {
			char c1=s1.charAt(i);
			char c2=s2.charAt(i);
			
			count[c1-'a']++;
			count[c2-'a']--;
		}
		
		for(int c:count) {
			if(c!=0) {
				System.out.println("Given String "+st1+", "+st2+" are not Anagram");
				return;
			}
		}
		System.out.println("Given String "+st1+", "+st2+" are Anagram");	}
}
