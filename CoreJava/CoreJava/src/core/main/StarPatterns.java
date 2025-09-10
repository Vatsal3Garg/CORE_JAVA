package core.main;


public class StarPatterns {
	
	public static void main(String[] args) {
		
		for (int i = 1; i <= 5; i++) {
			
			for (int space = 1; space < 5 ; space++) {
				System.out.print(" ");
			}
			
			for (int j = 1; j <= i; j++) {
				System.out.print("*");
			}
			
			System.out.println();
		}
		
	}

}
/*

Q1)

*****
*****
*****
*****
*****

Q2)

*
**
***
****
*****


Q3)

*
***
*****
*******
*********

Q4)

    *
   **
  ***
 ****
*****


Q5)

    *
   * *
  * * *
 * * * *
* * * * *
Q6)

    *
   ***
  *****
 *******
*********
Q7)

    *
   * *
  * * *
 * * * *
* * * * *
 * * * *
  * * * 
   * * 
    *  


Q8)

    *
   ***
  *****
 *******
*********
 *******
  *****
   ***
    *
*/