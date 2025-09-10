package core.main;

import java.util.Scanner;

public class Switch2 {

	public static void main(String[] args) {
		

		
		Scanner sc = new Scanner(System.in);
		System.out.println("enter any character: ");
		char any = sc.next().charAt(0);
		
		switch(any) {
		case 'a':case 'e':case 'i':case 'o':case 'u':case 'A':case 'E':case 'I':case 'O':
			case 'U':
		
		default:
			System.out.println(any + " is a vowel");
		
	}

}
}