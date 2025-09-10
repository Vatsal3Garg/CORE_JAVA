package core.main;


//https://leetcode.com/problems/find-numbers-with-even-number-of-digits/description/
public class EvenDigits {
	public static int findNumbers(int[] nums) {
		 int fin = 0;
		
        for (int i = 0; i < nums.length;i++){
            int a = nums[i];
            int count = 0;
           
            int b = -1;
            while ( a != 0){
                b = a % 10 ;
                count++;
                a = a/10;
                
            }
             if (count % 2 == 0){
                fin++;
                
            
             }
        }
        return fin;
    }
	public static void main(String[] args) {
		int[] arr = {12,13, 345,2,6,7896};
		System.out.println(findNumbers(arr));


	}

}
