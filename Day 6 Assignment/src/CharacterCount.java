import java.util.HashMap;

public class CharacterCount {
	public static void countCharacters(String str) {
		HashMap<Character,Integer> map=new HashMap<>();
		for(int i=0;i<str.length();i++) {
			if(map.containsKey(str.charAt(i))) {
				map.put(str.charAt(i), map.get(str.charAt(i))+1);
			}
			else {
				map.put(str.charAt(i), 1);
			}
		}
		System.out.println(map);
	}
	public static void main(String[] args) {
		String str="aabbccd";
		System.out.println("Character Count of "+str+" is: ");
		countCharacters(str);
		
		String st="AbbAcdaratcdcvht";
		countCharacters(st);
	}
}
