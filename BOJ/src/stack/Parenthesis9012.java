package stack;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Parenthesis9012 {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);

		int count;

		count = Integer.parseInt(scan.nextLine());

		String[][] ps = new String[count][];
		String[] result = new String[count];
		List<String> compare;
		
		
		for (int idx = 0; idx < count; idx++) {
			
			ps[idx] = scan.nextLine().split("");
			
		}
		
		for (int idx = 0; idx < count; idx++) {
			// 비교 리스트 초기화
			compare = new ArrayList<>();
			
			if (ps[idx][0].equals("(")) {

				for (int idx2 = 0; idx2 < ps[idx].length; idx2++) {
					if (ps[idx][idx2].equals(")")) {

						if (compare.size() -1 < 0) {
							
							result[idx] = "NO";
							
							break;
					
						} else {
							
							compare.remove(compare.size() -1);
							
							continue;
						}

					} else {

						compare.add(ps[idx][idx2]);
						
					}
					
				}

			} else {
				
				result[idx] = "NO";
				
				continue;
				
			} // if end

			if (compare.size() == 0) {
				
				if (result[idx].equals("NO")) {
					
				} else {
					result[idx] = "YES";					
				}
				
			} else {
				
				result[idx] = "NO";
				
			}
			
		} // for end
		
		
		for (String temp : result) {
			System.out.println(temp);
		}
		
		scan.close();
	}
}
