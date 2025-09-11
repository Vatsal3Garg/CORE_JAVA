package core.main;




//https://leetcode.com/problems/peak-index-in-a-mountain-array/description/



public class PeakIndexInMountainArray {
	public static int findPeakElement(int[] arr) {
        for(int i = 0 ; i< arr.length;i++){

    if(i == arr.length-1){
        return i;
    }else

    if (arr[i] > arr[i+1])
        return i;
    }
    return -1;
    }

	public static void main(String[] args) {
		int[] ar = {0,1,2,4,7,6,0,1,3};
		System.out.println(findPeakElement(ar));

	}

}
