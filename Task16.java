import java.util.Arrays;

public class Task16 {
	
	static void swap(int[] arr, int i, int j) {
	    // error checking
	    if (arr == null || i == j) {
	        return;
	    }
	    if (i < 0 || j < 0 || i > arr.length - 1 || j > arr.length - 1) {
	        return;
	    }
	    // looks good, swap the values
	    int t = arr[i];
	    arr[i] = arr[j];
	    arr[j] = t;
	}

	public static void main(String[] args) {
		// Task16
		
		int[] num = {0, 4, 0, 7, 8, 9, 0, 1};
		for(int i = 0; i < num.length; i++) {
			
			int x = num[0];
			int j = num[2];
			
			if (x == 0 && j == 0) {
				swap(num, 0, 7);
				swap(num, 2, 5);
				System.out.println(Arrays.toString(num));
				break;
			} 
		}
	}

}
