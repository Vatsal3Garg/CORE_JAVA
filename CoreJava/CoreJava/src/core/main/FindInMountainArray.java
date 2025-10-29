package core.main;


// https://leetcode.com/problems/find-in-mountain-array/description/
public class FindInMountainArray {
static int findPeak(int[] arr) {
		
		int s = 0;
		int e = arr.length - 1;
		
		while (s <= e) {
			
			int m =  s + (e - s)/2;
			if(arr[m] < arr[m + 1]) {
				s = m + 1;
			}
			else if(arr[m] < arr[m - 1]) {
				e = m - 1;
			}
				else {
				return m;
			}
	
		}
		return -1;
	}



static int binarySear(int [] arr, int tar , int s , int e) {
	
	
	
	 
	while(s <= e) {
		int m = s + (e - s)/2;
		if(tar < arr[m]) {
			e = m - 1;
			
		}else if(tar > arr[m]) {
			s = m + 1;
			
		}else if(tar == arr[m]) {
			return m ;
		}
	}
	return -1;
}
static int binarySer(int [] arr, int tar , int s , int e) {
	
	
	
	 
	while(s <= e) {
		int m = s + (e - s)/2;
		if(tar < arr[m]) {
			s = m +1;
			
		}else if(tar > arr[m]) {
			e = m -1;
			
		}else if(tar == arr[m]) {
			return m ;
		}
	}
	return -1;
}
		
static int FindEleinFirstAndSec(int tar, int[] arr) {
	
	int c = findPeak(arr);
	int d = arr.length - 1;
        if  (binarySear(arr, tar , 0, c ) >= 0) {
        	return binarySear(arr, tar , 0, c );
        	
        }else if(binarySer(arr, tar , c, d ) >= 0) {
        	return binarySer(arr, tar , c, d );
        }
        else {
        	return -1;
        }
	
}

	public static void main(String[] args) {
		int[] ar = {1, 5, 2};
		int ta = 2;
		System.out.println(FindEleinFirstAndSec(ta , ar));

	}

}
