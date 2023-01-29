package strings;

public class ReversingEachWord {

	public static void main(String[] args) {

        String s="It is Java";  // tI Si avaJ
        reverseEachWordInASentence(s);

	}
	
	static void reverseEachWordInASentence(String str) {
		String str1="";
		String rev ="";
		for(int i=str.length()-1; i>=0; i--) {
			
			str1 = str1+ str.charAt(i);
		}
		
		// System.out.print(str1);
		
		String words[] = str1.split(" ");
		for(int j=words.length-1; j>=0; j--) {
			
			rev=rev+words[j]+" ";
		}
		System.out.print(rev);
	}
}
