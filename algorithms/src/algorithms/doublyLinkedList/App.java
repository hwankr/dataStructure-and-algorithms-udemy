package algorithms.doublyLinkedList;

public class App {

	public static void main(String[] args) {
		var doublyList = new DoublyLinkedList<>();
		
		doublyList.addFirst(1);
		doublyList.addFirst(10);
		doublyList.addLast(20);
		doublyList.addLast(200);
		
//		doublyList.traverseForawrd();
		doublyList.traverseBackward();
	}

}
