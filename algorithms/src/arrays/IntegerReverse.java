package arrays;

import java.util.LinkedList;

public class IntegerReverse {
	public static void main(String[] args) {
		int n = 1234;
		
		IntegerReverse a = new IntegerReverse();
		System.out.println(a.reverse(n));
		System.out.println(a.reverse2(n));
	}
	
	public int reverse(int n) {
		int reversed = 0;
		int remainder = 0;
		
		LinkedList<Integer> numbers = new LinkedList<>();
		
		int i = 1;
		int quota = 0;
		while (true) {
			remainder = n % (i * 10);
			quota = remainder / i;
			numbers.add(quota);
			if (remainder == n) break;
			i *= 10;
			quota = 0;
		}

		int numbersSize = numbers.size();
		for (int j=0; j < numbersSize; j++) {
			int k = numbers.removeLast();
			reversed = (int) (reversed + k*Math.pow(10, j));
		}
		
		return reversed;
	}
	
	public int reverse2(int n) {
		int reversed = 0;
		
		while (n != 0) {
			int digit = n % 10;
			reversed = reversed * 10 + digit;
			n /= 10;
		}
		
		return reversed;
	}
}
