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

				if (cmd[idx].equals(")")) {

					stack.pop();
					stack.push("2");

				} else {

					stack.pop();
					stack.push("3");

				}

			}

		}

		scan.close();
	}
	
}
