package code;

public class StringFunction {
	
public static boolean isPalindrome(String str) {
		
		String result="";
		boolean flag=false;
		
		for (int i = str.length() - 1; i >= 0; i--) {
			result = result + str.charAt(i);
		}

		if (str.equalsIgnoreCase(result)) {
			flag=true;
		}
		
		return flag;
	}


}
