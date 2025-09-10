package core.main;

import java.util.Arrays;

public class swap {
	
	static void swap(int[] arr, int i , int j) {
		
		int temp = arr[i];
		arr[i] = arr[j];
		arr[j] = temp;
		
		System.out.println(Arrays.toString(arr));
		
	}

	public static void main(String[] args) {
		int [] arr = {1 , 3 , 5 , 6 , 8};
		swap(arr,0,4);
		
		

	}

}
