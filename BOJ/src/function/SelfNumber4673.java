package function;

import java.util.ArrayList;
import java.util.List;

public class SelfNumber4673 {

	public static void main(String[] args) {
		
		List<Integer> selfNumber = new ArrayList<>();

		int number = 0;
		
		while (number < 10000) {
			
			number++;
			
			int n = selfNumberCheck(number);
			
			if (n < 10001) {
				selfNumber.add(n);
			}
		}
		
		for (int idx = 1; idx < 10001; idx++) {
			
			if (!selfNumber.contains(idx)) {
				System.out.println(idx);
			}
		}
		
	}
	
	public static int selfNumberCheck(int number) {
		
		int sum = number;
		
		while (number > 0) {
			
			sum += number % 10;
			number /= 10;
			
		}
		
		return sum;
	}
}