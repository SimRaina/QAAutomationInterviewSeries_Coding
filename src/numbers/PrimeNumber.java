package numbers;

public class PrimeNumber {
	
	public static void main(String args[]) {
		
		if(isPrime(131)) {
			System.out.println("It is a Prime Number");
		}
		
		else {
			System.out.println("It is not a Prime Number");
		}
		
	}
	
	static boolean isPrime(int n) {
		
		if(n==0 | n==1) {
			return false;
		}
		
		else if(n==2) {  // 2 is the only even prime integer
			return true;
		}
		
		for(int i=3; i<=Math.sqrt(n); i++) {
			
			if(n%i==0) {
				return false;
			}
			
		}
		return true;
	}

}
