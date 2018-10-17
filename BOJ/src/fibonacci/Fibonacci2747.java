package fibonacci;

import java.util.Scanner;

public class Fibonacci2747 {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		int index = scan.nextInt();
		
		int a = 0;
		int b = 1;
		int sum = 0;
		
		for (int idx = 1; idx < index; idx++) {
			int temp = b;
			
			sum = a + b;
			
			a = temp;
			b = sum;
		}
		
		if (index == 0) {
			System.out.println(0);
		} else if (index == 1) {
			System.out.println(1);
		} else {			
			System.out.println(sum);
		}
		
		
		scan.close();
	}
	
}