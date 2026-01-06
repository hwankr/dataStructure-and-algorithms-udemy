package algorithms.arrays;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class App {	
	public static void main(String[] args) {
		
//		List<String> names = new ArrayList<>();
//		names.add("Kevin");
//		names.add("Daniel");
//		names.add("Adam");
//		names.add("Ana");
//		
////		names.remove(0);
////		System.out.println(names.get(0));
//		
//		System.out.println(names.size());
//		for (String name: names) {
//			System.out.println(name);
//		}
//		
//		
//		int[] nums = new int[10];
//		
//		for (int i=0; i<10; i++) {
//			nums[i] = i;
//		}
//
//		nums[0] = 100;
		
//		for (int i=0; i<10; i++) {
//			System.out.println(nums[i]);
//		}
		
//		for (int i=0; i<10; i++) {
//			if (nums[i] == 6) {
//				System.out.println("값 찾음 인덱스: " + i);
//			}
//		}
		
		int[] nums = {1, 2, 3, 4};
		
		ReverseArrayProblem problem = new ReverseArrayProblem();
		
		System.out.println(Arrays.toString(problem.solve(nums)));
	}
}
