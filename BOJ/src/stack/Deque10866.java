package stack;

import java.util.Deque;
import java.util.LinkedList;
import java.util.Scanner;

public class Deque10866 {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);

		int index;
		Deque<Integer> deque = new LinkedList<>();

		do {
			index = scan.nextInt();
		} while (index < 1 || index > 10000);

		for (int idx = 0; idx < index; idx++) {

			String cmd = scan.next();

			if (cmd.equals("push_front")) {

				int value = scan.nextInt();

				deque.addFirst(value);

			} else if (cmd.equals("push_back")) {

				int value = scan.nextInt();

				deque.addLast(value);

			} else if (cmd.equals("pop_front")) {
				
				System.out.println(deque.isEmpty() ? -1 : deque.pop());
				
			} else if (cmd.equals("pop_back")) {
				
				System.out.println(deque.isEmpty() ? -1 : deque.removeLast());
				
			} else if (cmd.equals("size")) {
				
				System.out.println(deque.size());
				
			} else if (cmd.equals("empty")) {
				
				System.out.println(deque.isEmpty() ? 1 : 0);
				
			} else if (cmd.equals("front")) {
				
				System.out.println(deque.isEmpty() ? -1 : deque.peek());
				
			} else if (cmd.equals("back")) {
				
				System.out.println(deque.isEmpty() ? -1 : deque.peekLast());
				
			}
		}

		scan.close();
	}

}
