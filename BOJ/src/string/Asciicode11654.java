package string;

import java.util.Scanner;

public class Asciicode11654 {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		String input = scan.next();
		
		int result = input.charAt(0);
		
		System.out.println(result);
		
		scan.close();
	}
}