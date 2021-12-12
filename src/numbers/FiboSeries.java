package numbers;

public class FiboSeries {
    int a = 0;
    int b = 1;
    
    int c;
	public static void main(String[] args) {
	
		FiboSeries fs = new FiboSeries();
		fs.fiboSeriesPrint();
	}
	
	public void fiboSeriesPrint() {
		
		/*
		 * 0 1 1 2 3 5 8 13 21 .. (Print first 10 numbers of the series)
		 * a = 0
		 * b = 1
		 *print a and b 
		 *for loop -> i = 2  i<=8 i++
		 * c = a+b print c
		 * 
		 * re assignment / moving the window 
		 * a = b
		 * b = c
		 */
		
		System.out.println(a + " " + b);
		
		for(int i = 2; i<=9; i++) {
			
			c = a + b;
			System.out.println(c);
			
			// Change the values/ move the window of and b
			a = b;
			b = c;
		}
		
	}

}
