package queue;

public class Queue<T extends Comparable<T>> {
	
	private Node<T> firstNode;
	private Node<T> lastNode;
	private int count;
	
	public void enqueue(T data) {
		this.count++;
		
		Node<T> oldLastNode = this.lastNode;
		this.lastNode = new Node<>(data);
		
		if (isEmpty()) {
			this.firstNode = this.lastNode;
		} else {
			oldLastNode.setNextNode(this.lastNode);
		}
	}
	
	public T dequeue() {
		if (isEmpty()) return null;
		
		this.count--;
		
		T dataToDequeue = this.firstNode.getData();
		this.firstNode = this.firstNode.getNextNode();
		
		if (isEmpty()) {
			this.lastNode = null;
		}
		
		return dataToDequeue;
	}
	
	public boolean isEmpty() {
		return this.firstNode == null;
	}
	
	public int size() {
		return this.count;
	}
}
