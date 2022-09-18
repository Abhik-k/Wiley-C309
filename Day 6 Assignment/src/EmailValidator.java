import java.util.regex.Pattern;

public class EmailValidator {
	public static void main(String[] args) {
		String email1="mandarmjog@gmail.com";
		System.out.print(email1+" - ");
		checkEmail(email1);
		String email2="wiley@g@.com";
		System.out.print(email2+" - ");
		checkEmail(email2);
		String email3=".wi@.gmail@1234";
		System.out.print(email3+" - ");
		checkEmail(email3);
		
//		String s3="Raja@abcorg";
//		checkEmail(s3);
	}

	private static void checkEmail(String email) {
		// TODO Auto-generated method stub
		if(email==null || email.isEmpty()) {
			System.out.println("Your email is Invalid");
			return;
		}
		
		String emailRegex ="^([a-zA-Z0-9\\._])+@([a-zA-Z0-9]+)"+"\\.([a-z]+)(.[a-z]+)?$";
		Pattern pattern =Pattern.compile(emailRegex);
		if(pattern.matcher(email).matches()) {
			System.out.println("Your email is Valid");
		}
		else {
			System.out.println("Your email is Invalid");
		}
	}
}
