package arrays;

import java.util.Scanner;

public class NumberOfWord1152 {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		String word = scan.nextLine().trim();
		
		if (word.equals(null)) {
			System.out.println(0);
		} else {
			System.out.println(word.split(" ").length);
		}
		
		scan.close();
	}
}