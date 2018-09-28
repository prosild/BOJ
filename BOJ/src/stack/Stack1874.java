package stack;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;

public class Stack1874 {

	public static void main(String[] args) throws IOException {

		BufferedReader in = new BufferedReader(new InputStreamReader(System.in));

		int count;
		int max = 0;
		int cmd = 0;
		
		List<Integer> progression = new ArrayList<>();
		String print = "";

		count = Integer.parseInt(in.readLine());
		
		while (count-- > 0) {
			
			cmd = Integer.parseInt(in.readLine());
			
			if (cmd < 1 || cmd > 100000) {
				count++;
				
				continue;
			}
			
			if (cmd > max) {
				
				for (int idx = max + 1; idx <= cmd; idx++) {
					
					progression.add(idx);
					print += "+\n";
					
				}
				
				max = cmd;
				
			} else if (cmd != progression.get(progression.size() - 1)) {
				
				System.out.println("NO");
				return;
			}
			
			print += "-\n";
			progression.remove(progression.size() - 1);
			
		}

		System.out.println(print);
		
		in.close();
	}
}