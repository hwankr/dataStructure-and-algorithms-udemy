package algorithms.doublyLinkedList;

public class DoublyLinkedList<T> {
	// Fist Node
	private Node<T> head;
	// Last node
	private Node<T> tail;
	private int size;
	
	public void traverseForawrd() {
		Node<T> actual = this.head;
		
		while (actual != null) {
			System.out.print(actual.getData() + " <-> ");
			actual = actual.getNext();
		}
	}
	
	public void traverseBackward() {
		Node<T> actual = this.tail;
		
		while (actual != null) {
			System.out.print(actual.getData() + " <-> ");
			actual = actual.getPrevious();
		}
	}
	
	
	
	public T getFirst() {
		if (this.head == null) 
			throw new RuntimeException("List is empty");
		
		T removeNode = this.head.getData();
		
		this.head = this.head.getNext();
		if (this.head != null)
			this.head.setPrevious(null);
		else {
			this.tail = null;
		}
		
		this.size--; 
		
		return removeNode;
	}
	
	public T getLast() {
		if (this.tail == null) 
			throw new RuntimeException("List is empty");
		
		T removeNode = this.tail.getData();
		
		this.tail = this.tail.getPrevious();
		if (this.tail != null)
			this.tail.setNext(null);
		else {
			this.head = null;
		}
		
		this.size--;
		
		return removeNode;
	}
	
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
	
	public void removeFirst(T data) {
		
	}
}
