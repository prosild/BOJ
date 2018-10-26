package arrays;

import java.util.Scanner;

public class AverageGrade10039 {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		int[] grade = new int[5];
		int sum = 0;
		
		for (int idx = 0; idx < grade.length; idx++) {
			grade[idx] = scan.nextInt();
		}
		
		for (int idx = 0; idx < grade.length; idx++) {
			if (grade[idx] >= 40) {
				sum += grade[idx];
			} else {
				sum += 40;
			}
		}
		
		System.out.println(sum / 5);
		
		scan.close();
	}
}
