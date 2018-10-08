package stack;

import java.util.Scanner;
import java.util.Stack;

public class ValueOfParenthesis2504 {

	public static void main(String[] args) {

		Stack<String> stack = new Stack<>();
		Scanner scan = new Scanner(System.in);
		String[] cmd;

		do {

			cmd = scan.next().split("");

		} while (cmd.length < 1 || cmd.length > 30);

		for (int idx = 0; idx < cmd.length; idx++) {

			if (cmd[idx].equals("(") || cmd[idx].equals("[")) {

				stack.push(cmd[idx]);

			} else {

				String top = stack.peek();

				if (cmd[idx].equals(")")) {

					stack.pop();
					
					stack.push(calc("2", top));

				} else {

					stack.pop();

					stack.push(calc("3", top));

				}

			}

		}
		
		for (String temp : stack) {
			System.out.println(temp);
		}

		scan.close();
	}
	
	public static String calc(String push, String top) {
	
		int sum;
		
		if (top.equals("2") || top.equals("3")) {
			
			sum = Integer.parseInt(push) + Integer.parseInt(top);

		} else {
			
			sum = Integer.parseInt(push);
		}
		
		return String.valueOf(sum);
	}
}
