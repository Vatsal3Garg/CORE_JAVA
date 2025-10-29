package core.main;

public class SearchInRotatedSortedArr {
	
	
	
	
     static int findpivot(int[] arr) {
		
		int s = 0;
		int e = arr.length-1;
		
		
		while (s<=e) {
			int m = s + (e-s)/2;
			if(m < e && arr[m] > arr[m+1]) {
				return m;
			}
			else if(m > s && arr[m]  < arr[m-1]) {
				return m-1;
			}else if(arr[m] < arr[s]) {
				e = m - 1;
				
			}else if(arr[m] > arr[s]) {
				s = m + 1;
			}
		}
		return -1;
		
		
	}

     
     static int bins(int[] arr , int tar, int s , int e) {
    	 while (s <= e) {
 			int m = s + (e-s)/2;
 			if(tar < arr[m]) {
 				e = m - 1;
 				
 			}else if(tar > arr[m] ) {
 				s = m + 1;
 			}else{
 				return m;
 				
 			}
 		}
 		return -1;
    	 
     }
     
     static int findele(int[] arr, int tar) {
         int n = arr.length;
         if (n == 0) return -1; 
         if (n == 1) return arr[0] == tar ? 0 : -1; 

         int pivot = findpivot(arr);

         // If array is not rotated
         if (pivot == -1) {
             return bins(arr, tar, 0, n - 1);
         }

         // If target is the pivot
         if (arr[pivot] == tar) return pivot;

         // Decide search side
         if (tar >= arr[0]) {
             return bins(arr, tar, 0, pivot - 1);
         } else {
             return bins(arr, tar, pivot + 1, n - 1);
         }
     }
	public static void main(String[] args) {
		
		int[] ar = {1};
		int t = 0;
		System.out.println(findele(ar,t));
		

	}

}
