package arrays;

import java.util.Scanner;

public class Scale2920 {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		int[] cmd = new int[8];
		int count = 0;
		
		for (int idx = 0; idx < 8; idx++) {
			cmd[idx] = scan.nextInt();
		}
		
		for (int idx = 0; idx < 8; idx++) {
			
			if (cmd[idx] == idx + 1) {
				count++;
			} else if (cmd[idx] == (8 - idx)) {
				count--;
			}
		}
		
		if (count == 8) {
			System.out.println("ascending");
		} else if (count == -8) {
			System.out.println("descending");
		} else {
			System.out.println("mixed");
		}
		
		scan.close();
	}
}
