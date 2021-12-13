package array;

public class SecondHighestElement {
	
	int[] arr= {5,3,8,22,4,11,33};
	int first;
	int second;

	public static void main(String[] args) {
		SecondHighestElement sh = new SecondHighestElement();
		sh.findingSecondHighest();
	}
	
	public void findingSecondHighest() {
		
		/* Assumption = no duplicate elements
		 * arr = {5,3,8,22,4,11,33}
		 * first -> first highest (max)
		 * second  -> second highest
		 * 
		 * 1. Assigning initial arr[0] and arr[1]
		 * 2. for 2 -> till the array.length-1
		 * 3. change the values of first and second accordingly (new element is bigger than first) 
		 * 	new element is in between first and second
		 * 
		 */
		
		if(arr[0] > arr[1]) {
			first = arr[0];
			second= arr[1];
		}
		else if(arr[0] < arr[1]) {
			second = arr[0];
			first= arr[1];
		}
		
		for(int i = 2; i< arr.length; i++) {
			
			if(arr[i] > first) {
				second = first;
				first = arr[i];
			}
			
			else if(arr[i] > second && arr[i] < first) {
				second = arr[i];
			}
		}
		System.out.println("Second highest element in the array: "+ second);
			
		
	}

}
