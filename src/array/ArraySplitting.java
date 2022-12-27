package array;


/** Split the array into two sub-arrays such that sum of elements in left sub-array is equal 
to sum of elements in right sub-array **/

public class ArraySplitting {
	
	static int[] array= {1,2,3};  // 1,2=3      and    3 
	

	public static void main(String[] args) {
		
         test();
	}
	
	public static void test() {
		
		int size = array.length;
		int splitpoint = findSplitPoint(array, size);
		
		
		for(int i=0; i<size; i++) {
			
			if(splitpoint == i) {
				System.out.println();
			}
			
			System.out.print(array[i]+ " ");
		}
		
		
	}

	public static int findSplitPoint(int[] array, int n) {
		
		int leftsum =0;
		
		for(int i=0; i<n; i++) {
			
			leftsum+= array[i];  // 1+2 = 3
			
			int rightsum =0;
			for(int j=i+1; j<n; j++) {
				
				rightsum+= array[j]; // 3
			}
			
			if(leftsum==rightsum) {
				return i+1; // returning the split point/position
			}
		}
		return -1;
	}
}
