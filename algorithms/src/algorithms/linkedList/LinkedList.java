package algorithms.linkedList;

public class LinkedList<T extends Comparable<T>> implements List<T> {
	private Node<T> root; 
	private int numOfItems;
	
	@Override
	public void insert(T data) {
		 if (root == null) {
			 root = new Node<>(data);
		 } else {
			 insertBeginning(data);
		 }
		
	}

	private void insertBeginning(T data) {
 		Node<T> newNode = new Node<>(data);
 		newNode.setNextNode(root);
 		root = newNode; 
	}
	
	// 마지막 노드를 찾아야 함 O(N)
	private void insertEnd(T data, Node<T> node) {
 		if (node.getNextNode() != null) {
 			insertEnd(data, node.getNextNode());
 		} else {
 			// 마지막 노드 찾음
 			Node<T> newNode = new Node<>(data);
 			node.setNextNode(newNode);
 		}
	}

	@Override
	public void remove(T data) {
		 
		
	}

	@Override
	public void traverse() {
 		if (root == null) return;
 		
 		Node<T> actualNode = root;
 		
 		while (actualNode != null) {
 			System.out.println(actualNode);
 			actualNode = actualNode.getNextNode();
 		}
	}

	@Override
	public int size() {
 		return numOfItems;
	}
	
}
