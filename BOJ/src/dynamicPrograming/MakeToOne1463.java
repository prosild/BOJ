package dynamicPrograming;

import java.util.Scanner;

public class MakeToOne1463 {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		int number = scan.nextInt();
		int count = 0;
		
		while (number != 1) {
			
			if (number % 3 == 0) {
				number /= 3;
				count++;
			} else if (number % 2 == 0) {
				number /= 2;
				count++;
			} else {
				number -= 1;
				count++;
			}
		}
		
		System.out.println(count);
		
		scan.close();
	}
}
