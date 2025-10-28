package interview.code;

import java.util.Arrays;

public class SmallestElement {

	public static void main(String[] args) {
		int[] arr = { 2, 3, 5, 6, 1, 3, 5, 2, 6,0, 7, 8 };
//		int smallelem = Arrays.stream(arr).min().getAsInt();
//		System.out.println(smallelem);
		
	
//		OR
	
		int small = findSmallElem(arr);		
		System.out.println("Print smallest element: " +small);
		
	}

	private static int findSmallElem(int[] arr) {
		int min = arr[0];  //Assume the first element is smallest
		for(int i =1 ; i < arr.length; i++) {
			if(arr[i] < min) {
				 min = arr[i]; // Update id 
			}
		}
		return min;
	}

}
