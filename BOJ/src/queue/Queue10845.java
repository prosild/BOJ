package queue;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Queue10845 {
	
	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);

		int num;
		String cmd;
		
		List<String> pushs = new ArrayList<>();
		
		do {
			
			num = scan.nextInt();
			scan.nextLine();
		
		} while (num < 1 || num > 10000);
		
		for (int idx = 0; idx < num; idx++) {
			
			cmd = scan.nextLine();
			
			if (cmd.contains("push")) {
				
				String[] x = cmd.split(" ");
				
				pushs.add(x[1]);
				
			} else if (cmd.contains("pop")) {
				
				if (pushs.size() == 0) {
				
					System.out.println(-1);
				
				} else {
					
					System.out.println(pushs.get(0));
					pushs.remove(0);
				
				}
			
			} else if (cmd.contains("size")) {
				
				System.out.println(pushs.size());
				
			} else if (cmd.contains("empty")) {
				
				if (pushs.isEmpty()) {
					
					System.out.println(1);
					
				} else {
					
					System.out.println(0);
					
				}
				
			} else if (cmd.contains("front")) {
				
				if (pushs.isEmpty()) {
					
					System.out.println(-1);
					
				} else {
					
					System.out.println(pushs.get(0));
					
				}

			} else if (cmd.contains("back")) {
				
				if (pushs.isEmpty()) {
					
					System.out.println(-1);
				
				} else {
					
					System.out.println(pushs.get(pushs.size() - 1));
				
				}
			}
			
		}
		
		scan.close();
	}
}
