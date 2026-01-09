package algorithms.arrays;

public class PalindromeProblem {
	public static void main(String[] args) {
		String s1 = "radar";
		String s2 = "madam";
		
		PalindromeProblem palindrome = new PalindromeProblem();
		System.out.println(palindrome.solve(s1));
		System.out.println(palindrome.solve(s2));
		
		System.out.println(palindrome.solve2(s1, 0, s1.length()-1));
	}
	
	public static boolean solve(String s) {
		int i = 0;
		int j = s.length()-1;
		
		while (i < j) {
			if (s.charAt(i) != s.charAt(j)) return false;
			i++; j--;
		}
		return true;
	}
	
	public static boolean solve2(String s, int left, int right) {
		if (left >= right) return true;
		if (s.charAt(left) != s.charAt(right)) return false;
		return solve2(s, left+1, right-1);
	}
}
