package stack;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Stack1874 {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		int num;
		List<Integer> cmd = new ArrayList<>();
		List<Integer> progression = new ArrayList<>();
		
		do {
			
			num = scan.nextInt();
		
		} while (num < 1 || num > 100000);
		
		
		for (int idx = 0; idx < num; idx++) {
			cmd.add(scan.nextInt());
		}
		
		for (int idx = 0; idx < num; idx++) {
			
			int pnum = idx + 1;
			
			if (cmd.get(idx) >= pnum) {
				
				progression.add(pnum);
				

			} else if (cmd.get(idx) == progression.get(progression.size() - 1)) {
				
				System.out.println(progression.get(progression.size() - 1));
				progression.remove(progression.size() - 1);
				
			}
			
		}
		
		
		scan.close();
	}
}
