package algorithms.doublyLinkedList;

public class DoublyLinkedList<T> {
	// Fist Node
	private Node<T> head;
	// Last node
	private Node<T> tail;
	private int size;
	
	// O(1)
	public void addFirst(T data) {
		Node<T> newNode = new Node<>(data);
		
		if (this.head == null) {
			this.head = newNode;
			this.tail = newNode;
		} else {
			newNode.setNext(this.head);
			this.head.setPrevious(newNode);
			this.head = newNode;
		}
		
		this.size++;
	}
	
	public void addLast(T data) {
		Node<T> newNode = new Node<>(data);
		
		if (this.tail == null) {
			this.head = newNode;
			this.tail = newNode;
		} else {
			this.tail.setNext(newNode);
			newNode.setPrevious(this.tail);
			this.tail = newNode;
		}
		
		this.size++;
	}
}
