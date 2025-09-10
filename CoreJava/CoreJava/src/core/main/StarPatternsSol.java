package core.main;


public class StarPatternsSol {
	
	public static void main(String[] args) {
		
		int i = 1;
		int j = 1;
		
		
		
		
		
		/*
		question 1
		*/
		for( i = 1 ; i <= 4 ; i++) {
			for(j = 1 ; j <= 4;j++ ) {
				System.out.print("*");
			}
			System.out.println(" ");
		}
		System.out.println("---------------------");
		
		
		
		
		
		
		
		/*
		question 2
		*/

		
		for(i = 1;i<=5;i++) {
			for (j=1 ; j <= i;j++) {
				System.out.print("*");
			}
			System.out.println(" ");
		}
		System.out.println("---------------------");
		
		
		
		
		
		
		
		
		/*
		question 3
		*/
		for(i = 1;i<=5;i++) {
			for (j=1 ; j < 2*i;    j++) {
				System.out.print("*");
			}
			System.out.println(" ");
		}
		
		System.out.println("---------------------");
		
		
		
		
		
		
		
		
		/*
		question 4
		
		*/
		for (i = 1; i <= 5; i++ ) {
			for(j = 1; j < 6-i; j++) {
			System.out.print(" ");
			}
			for(int k = 5; k >= j;k-- ) {
				System.out.print("*");
			}
			System.out.println(" ");
		}
		
		System.out.println("---------------------");
		
		
		
		
		
		
		
		
		/*
		question 5
		*/
		for(i = 1; i<=5 ; i++) {
			for(j=i; j<5;j++) {
				System.out.print(" ");
			}
			
			for(int k = 1 ; k<= 2*i-1; k++) {
				System.out.print("*");
			}
			System.out.println(" ");
		}
		
		
		System.out.println("---------------------");
		
		
		
		
		
		
		
		/*
		question 6
		*/
		for(i = 1; i<=5 ; i++) {
			for(j=i; j<5;j++) {
				System.out.print(" ");
			}
			
			for(int k = 1 ; k<= 2*i-1; k++) {
				System.out.print("*");
			}
			System.out.println(" ");
		}
		
		System.out.println("---------------------");
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