package strings;

public class PalindromeCheckString {

	String s = "preet";
	String reverse_string = "";
	public static void main(String[] args) {
		
		PalindromeCheckString pcs = new PalindromeCheckString();
		pcs.palindromeCheck(pcs.reverseString());
	}
	
	public String reverseString() {
		
		/*
		 * 
		 * run a reverse iterator/loop -> lenth()-1 to 0 
		 * start appending the characters at the index to a new reverse_string
		 */
		
		for(int i = s.length()-1; i>=0; i--) {
			
			reverse_string = reverse_string + s.charAt(i);
		}
		
		System.out.println(reverse_string);
		return reverse_string;
	}
	
	public void palindromeCheck(String string_to_check) {
		
		if(string_to_check.equalsIgnoreCase(s)) {
			System.out.println("String is Palindrome");
		}
		
		else {
			System.out.println("String is not Palindrome");
		}
		
	}

}
