package stack;

import java.util.Scanner;

public class Deque10866 {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		int index;
		String[] deque = new String[0];
		
		do {
			index = scan.nextInt();
		} while (index < 1 || index > 10000);
		
		String[] cmd = new String[index];
		
		for (int idx = 0; idx < cmd.length; idx++) {
			
			cmd[idx] = scan.nextLine();
			
		}
		
		for (int idx = 0; idx < cmd.length; idx++) {
			
			String[] temp = cmd[idx].split(" ");
			
			if (temp[0].equals("push_back")) {
				
				String[] temps = new String[deque.length + 1];
				temps = deque.clone();
				
			}
			
		}
		
		scan.close();
	}
}
