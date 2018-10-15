package fibonacci;

import java.util.Scanner;

public class Fibonacci2747 {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		int index = scan.nextInt();
		
		System.out.println(fibo(index));
		
		scan.close();
	}
	
	public static int fibo(int idx) {
		
		int result;
		
		if (idx <= 1) {
			
			result = idx;
			
		} else {
			
			result = fibo(idx - 2) + fibo(idx - 1);
			
		}
		
		return result;
	}
}
