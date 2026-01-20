package linkedList;

public class Node<T extends Comparable<T>> {
	private T data;
	// LinkedList가 Array보다 더 많은 메모리를 필요로 하는 이유.
	private Node<T> nextNode;
	public Node(T data) {
		this.data = data;
	}
	
	public T getData() {
		return data;
	}
	public void setData(T data) {
		this.data = data;
	}
	public Node<T> getNextNode() {
		return nextNode;
	}
	public void setNextNode(Node<T> nextNode) {
		this.nextNode = nextNode;
	}

	@Override
	public String toString() {
		return ""+data;
	}
}
