package core.main;

import java.util.Scanner;

public class MAX3 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Enter first number: ");
		int a = sc.nextInt();
		System.out.print("Enter second number: ");
		int b = sc.nextInt();
		System.out.print("Enter third number: ");
		int c = sc.nextInt();
		
		
		if(a > b && a > c) {
			System.out.println("a is maximum");
		}
		else if(b > c && b > a) {
			System.out.println("b is maximum");
		}else {
			System.out.println("c is maximum");
		}
		
		
	}
}
