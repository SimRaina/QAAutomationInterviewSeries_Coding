package numbers;

public class PalindromeCheck {

	
	/*
	 * 
	 * 121 -> reverse this number it should be same as original
	 * n = 121
	 * 
	 * temp = n
	 * rev_num = 0
	 * loop (3 times)
	 * 1. modulus rem = temp%10 -> 1
	 * 2. rev_num = (rev_num*10) + rem  -> 0 * 10 + 1 = 1 * 10 + 2 = 12*10 120 + 1 = 121
	 * 3. division temp = temp / 10 = 1
	 */
	
	int n = 1211;
	int temp=0;
	int rev_num=0;
	int rem;
	
	public static void main(String[] args) {
	
     PalindromeCheck pc = new PalindromeCheck();
     pc.test();
	}
	
	public void test() {
		
		temp = n;
		while(temp != 0) {
			
			rem = temp%10;
			rev_num = (rev_num * 10) + rem; // reverse of the int number
			temp = temp/10;
		}
		
		if(rev_num == n) {
			System.out.println( n + " is Palindrome");
		}
		
		else {
			System.out.println( n + " is not Palindrome");
		}
	}

}
