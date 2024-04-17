package strings;

public class SubStringOccurences {
	
	public static void main(String[] args) {

		String str="A man, a plan, a canal, Panama";
		String substr="an";
        findOccurence(str, substr);

	}
	
	static void findOccurence(String str, String substr) {
		
		int count=0;

		String words[] = str.split(" ");

		for(int i=0; i<words.length; i++) {


			if(words[i].length() >=2) {

				if(words[i].contains(substr)) {
					count++;
				}	
			}
		}
		System.out.println(" \"an\" exists: " 
		+ count + " times");
	}

}
