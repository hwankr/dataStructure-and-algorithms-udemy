package algorithms.arrays;

public class App {	
	public static void main(String[] args) {
		int[] nums = new int[10];
		
		for (int i=0; i<10; i++) {
			nums[i] = i;
		}

		nums[0] = 100;
		
//		for (int i=0; i<10; i++) {
//			System.out.println(nums[i]);
//		}
		
		for (int i=0; i<10; i++) {
			if (nums[i] == 6) {
				System.out.println("값 찾음 인덱스: " + i);
			}
		}
	}
}
