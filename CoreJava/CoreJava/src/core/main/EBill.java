package core.main;

import java.util.Scanner;

public class EBill {

	public static void main(String[] args) {
		int bill;
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the number of units: ");
int units = sc.nextInt();
if ( units >= 1 && units <= 100) {
	 bill = units * 2;
	System.out.println("Bill is: " + bill);
}else if(units >= 101 && units <= 200) {
	bill = 200 + (units-100)*5;
	System.out.println("Bill is: " + bill);
}else if(units >= 201 && units <= 300) {
	bill = 200 + 100*5 + (units-200)*7;
	System.out.println("Bill is: " + bill);
}else if(units >= 301 && units <= 400) {
	bill = 100*2 + 100*5 + 100*7 + (units-300)*10;
	System.out.println("Bill is: " + bill);
}else if(units >= 401 && units <= 500) {
	bill = 100*2 + 100*5 + 100*7 + 100*10 + (units-400)*12;
	System.out.println("Bill is: " + bill);
}else if(units > 500) {
	bill = ( 100*2 + 100*5 + 100*7 + 100*10 + 100*12 + (units-500)*15)	;
	System.out.println("Bill is: " + bill);
}else if (units < 0 ) { 
	System.out.println("Invalid input");
}
	}

}
