package core.main;

import java.util.Scanner;

public class Switch1 {

	public static void main(String[] args) {
		Scanner sc = new Scanner (System.in);
		System.out.println("Enter any character: ");
		char any = sc.next().charAt(0);
		
		switch(any){
			case 'a': System.out.println(any + " is vowel");
			break;
			case 'e': System.out.println(any + " is vowel");
			break;
			case 'i': System.out.println(any + " is vowel");
			break;
			case 'o': System.out.println(any + " is vowel");
			break;
			case 'u': System.out.println(any + " is vowel");
			break;
			case 'A': System.out.println(any + " is vowel");
			break;
			case 'E': System.out.println(any + " is vowel");
			break;
			case 'I': System.out.println(any + " is vowel");
			break;
			case 'O': System.out.println(any + " is vowel");
			break;
			case 'U': System.out.println(any + " is vowel");
			break;
			default: System.out.println("Invalid Output");
		}
		
		

	}

}
