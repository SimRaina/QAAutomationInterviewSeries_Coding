package strings;

import java.util.HashMap;

/**
 * 
 * @author simrainaqa
 * Find vowels and its occurrences in a String
 */
public class FindVowels {

	public static void main(String[] args) {
		
		String s = "SIMRAINAQA";
		findVowel(s);

	}
	
	static void findVowel(String str) {
		
		HashMap<Character, Integer> map = new HashMap<>();
		
		// char[] ch = str.toCharArray(); this is not working with equals()
		
		for(int i=0; i<str.length(); i++) {
			
			Character c = str.charAt(i);
			// check for vower or not
			if(c.equals('A') || c.equals('E') || c.equals('I') ||  c.equals('O') || c.equals('U')){
				
				if(!(map.containsKey(c))) {
					map.put(c,  1);
				}
				
				else {
					map.put(c,  map.get(c)+1);
				}
			}
		}
		System.out.println(map);
	}
}
