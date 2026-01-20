package stack;

public class App {

	public static void main(String[] args) {
		
		Stack<String> names = new Stack<>();
		
		names.push("Adam");
		names.push("Ana");
		names.push("Kevin");
		names.push("Michael");
		
		while(!names.isEmpty()) {
			System.out.println(names.pop());
		}
		
		ArrayStack<Integer> nums = new ArrayStack<>();
		
		nums.push(1);
		nums.push(2);
		nums.push(3);
		nums.push(4);
		nums.push(5);
		nums.push(6);
		
		while (!nums.isEmpty()) 
			System.out.println(nums.pop());
	}
}
