package core.main;

import java.util.Scanner;

public class GradeSystem {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the marks: ");
int marks = sc.nextInt();
if ( marks >= 90 && marks <= 100) {
	System.out.println("A+ Grade");
}else if(marks >= 70 && marks <= 89) {
	System.out.println("B+ Grade");
}else if(marks >= 60 && marks <= 69) {
	System.out.println("First");
}else if(marks >= 33 && marks <= 59) {
	System.out.println("Just Pass");
}else if(marks >= 0 && marks <= 32) {
	System.out.println("Fail");
}else  {
	System.out.println("Invalid input");
}
	}

}
