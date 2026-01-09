package algorithms.arrays;

public class PalindromeProblem {
	public static void main(String[] args) {
		String s1 = "radar";
		String s2 = "madam";
		
		PalindromeProblem palindrome = new PalindromeProblem();
		System.out.println(palindrome.solve(s1));
		System.out.println(palindrome.solve(s2));
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
}
