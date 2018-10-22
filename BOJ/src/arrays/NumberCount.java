package arrays;

import java.util.Scanner;

public class NumberCount {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		int mulResult = 1;
		int result[] = new int[10];
		
		for (int idx = 0; idx < 3; idx++) {
			mulResult *= scan.nextInt();
		}
		
		String temp = String.valueOf(mulResult);
		
		for (int idx = 0; idx < temp.length(); idx++) {
			for (int idx2 = 0; idx2 < 10; idx2++) {
				
				if ((temp.charAt(idx) - '0') == idx2) {
					result[idx2]++;
				}
			}
		}

		for (int r : result) {
			System.out.println(r);
		}
		
		scan.close();
	}
}
