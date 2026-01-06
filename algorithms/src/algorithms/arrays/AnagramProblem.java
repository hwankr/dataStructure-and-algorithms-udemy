package algorithms.arrays;

import java.util.Arrays;

public class AnagramProblem {
//    public boolean solve(char[] s1, char[] s2) {
//		if (s1.length != s2.length) return false;
//    	
//		char[] s2Copy = s2.clone();
//		
//		for (char ch1: s1) {
//			boolean found = false;
//			for (int i=0; i<s2Copy.length; i++) {
//				if (s2Copy[i] == ch1) {
//					s2Copy[i] = '\u0000';
//					found = true;
//					break;
//				}
//			}
//			if (found == false) return false;
//		}
//	
//		return true;
//	}
	
	public boolean solve(char[] s1, char[] s2) {
		if (s1.length != s2.length) return false;
		
		Arrays.sort(s1);
		Arrays.sort(s2);
		
		return Arrays.equals(s1, s2);	
	}
}
