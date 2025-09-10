package core.main;

import java.util.Scanner;

public class ForLoop1 {
	

	public static void main(String[] args) {
		Long rem;
		Scanner sc = new Scanner (System.in);
		System.out.print("Enter any number: ");
		Long n = sc.nextLong();
		for(int i = 1;i <= n;i ++) {
			
			rem = n % i;
			if(rem == 0) {
				System.out.print(i + " ");
			}else {
				System.out.print("");
			}
			
		}

	}

}
