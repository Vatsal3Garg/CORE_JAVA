package core.main;

import java.util.Scanner;

public class ladderif2 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
System.out.print("Enter a day : ");
int n = sc.nextInt();

if ( n == 1) {
	System.out.println("MONDAY");
}
else if(n==2)
{
System.out.println("TUESDAY");
}else if(n==3)
{
System.out.println("WEDNESDAY");
}
else if(n==4)
{
System.out.println("FRIDAY");
}
else if(n==5)
{
System.out.println("SATURDAY");
}
else if(n==6)
{
System.out.println("SUNDAY");
}
else {
	System.out.println("Invalid input");
}

}}