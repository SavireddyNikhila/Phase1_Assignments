package RegexProg;

import java.util.Scanner;
import java.util.regex.Pattern;

public class Regex_PhoneNoValidation {

	public static void main(String[] args) {
		System.out.println("Enter a phone number: ");
		Scanner sc = new Scanner(System.in);
		String PhoneNo = sc.nextLine();
		System.out.println("PhoneNo = " + validatePhoneNo(PhoneNo));

	}

	public static String validatePhoneNo(String phNo){
		if(phNo==null || phNo.isEmpty()){
			return "Not Valid";
		}
		Pattern pattern;
		String phNoRegex="^(?:\\+)91((\\s*[\\-]\\s*)?(\\s*)?)?[6789]\\d{9}$";
		Pattern pattern1=Pattern.compile(phNoRegex);
		if(pattern1.matcher(phNo).matches()){
		return "Valid";
		}
		else
		{
			return "Not valid";
		}
	}

}
