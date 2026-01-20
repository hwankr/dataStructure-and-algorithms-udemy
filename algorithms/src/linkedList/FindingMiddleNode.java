package linkedList;

public class FindingMiddleNode {
	public static void main(String[] args) {
		FindingMiddleNode ex = new FindingMiddleNode();
		
		List list1 = ex.new LinkedList();
		list1.insert(4);
		list1.insert(3);
		list1.insert(2);
		list1.insert(1);
//		list1.traverse();
		System.out.println(list1.getMiddleNode());
 		
		List list2 = ex.new LinkedList();
		list2.insert(5);
		list2.insert(4);
		list2.insert(3);
		list2.insert(2);
		list2.insert(1);
		System.out.println(list2.getMiddleNode());
 	}
	
	class LinkedList implements List {

		// this is the head node or root node
		private Node root;
		private int numOfItems;
		
		@Override
		public Node getMiddleNode() {
			Node ptrNode = root;
			Node middleNode = root;
			// 1 2 3 4 5
			
			
			while (ptrNode != null && ptrNode.getNextNode() != null) {
				ptrNode = ptrNode.getNextNode().getNextNode();
				middleNode = middleNode.getNextNode();
			}
			
			return middleNode;
		} 
		
		@Override
		public void insert(int data) {
			
			if(root==null) {
				// this is the first item in the linked list
				root = new Node(data);
			} else {
				// we know that this is not the first item in the linked list
				insertBeginning(data);
			}
			numOfItems++;
		}

		// we just have to update the references O(1)
		private void insertBeginning(int data) {
			Node newNode = new Node(data);
			newNode.setNextNode(root);
			root = newNode;
		}
		
		// because we have to start with the root node
		// first we have to find the last node in O(N)
		private void insertEnd(int data, Node node) {
			
			// this is when we keep looking for the last node O(N)
			if(node.getNextNode() != null) {
				insertEnd(data, node.getNextNode());
			} else {
				// we have found the last node
				Node newNode = new Node(data);
				node.setNextNode(newNode);
			}
		}

		@Override
		public void traverse() {
			
			if(root==null) return;
			
			Node actualNode = root;
			
			while(actualNode != null) {
				System.out.println(actualNode);
				actualNode = actualNode.getNextNode();
			}	
		}

		@Override
		public int size() {
			return numOfItems;
		}
	}

	interface List {
	    public Node getMiddleNode();
	    public void insert(int data);
	    public void traverse();
	    public int size();
	}

	class Node {

	    private int data;
	    private Node nextNode;

	    public Node(int data) {
	        this.data = data;
	    }

	    public int getData() {
	        return data;
	    }

	    public Node getNextNode() {
	        return nextNode;
	    }

	    public void setData(int data) {
	        this.data = data;
	    }

	    public void setNextNode(Node nextNode) {
	        this.nextNode = nextNode;
	    }

	    @Override
	    public String toString() {
	        return "" + this.data;
	    }
	}
}

