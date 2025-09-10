package core.main;

import java.util.Scanner;

public class ForLoop3Factorial {
	

	public static void main(String[] args) {
		
	Scanner sc = new Scanner (System.in);
	System.out.println("Enter any number for factorial: ");
	int n =  sc.nextInt();
	int b=1 ;
	int a;
	
		
		for (int i = 0 ; i<= n-1; i++) {
			a = n - i ;
			b = b * a;
			
			
		}
		System.out.println(b);
	}

}
