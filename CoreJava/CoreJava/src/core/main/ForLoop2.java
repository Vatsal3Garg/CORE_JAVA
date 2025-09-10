package core.main;

import java.util.Scanner;

public class ForLoop2 {
	

	public static void main(String[] args) {
		
		int a = 1;
		int b = 5;
		for (int i = 1; i<=10; i ++) {
			
			if(i%2==0) {
				System.out.println(a);
				a = ++a;
				
				
			}else {
				System.out.println(b);
				b=--b;
				
			}
		}

	}

}
