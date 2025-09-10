package core.main;

import java.util.Scanner;

public class forPrime {
	

	public static void main(String[] args) {
		
	Scanner sc = new Scanner (System.in);
	System.out.println("Enter any number for Checking: ");
	int n =  sc.nextInt();
	
	int rem ;
	
	for (int i = 2 ; i <= n-1;i ++) {
		rem = n % i;
		if(rem == 0) {
			System.out.println(n + " is not prime ");
		}else {
			System.out.println(n + " is prime");
		}
	}
	

}
}

