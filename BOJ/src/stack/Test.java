package stack;

public class Test {
	
	public static void main(String[] args) {
		
		String test = "가나다라마바사아자차카";
		
		String[] testArrays = test.split("");
		
		for (String temp : testArrays) {
			System.out.println(temp);
		}
	}
}
