package arrays;

import java.util.Scanner;

public class Oxquiz8958 {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);

		int count = 0;
		int result;
		int conti;
		
		do {

			count = scan.nextInt();

		} while (count < 0 && count > 80);
		scan.nextLine();

		String[] cmd = new String[count];

		for (int idx = 0; idx < count; idx++) {
			cmd[idx] = scan.nextLine();
		}

		for (int idx = 0; idx < cmd.length; idx++) {
			
			String[] temp = cmd[idx].split("");
			result = 0;
			conti = 0;
			
			for (int index = 0; index < temp.length; index++) {
				if (temp[index].equals("O")) {
					result += ++conti;
				} else {
					conti = 0;
				}
			}
			
			System.out.println(result);
		}
		
		
		scan.close();
	}
}
