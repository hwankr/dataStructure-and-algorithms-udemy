package algorithms.linkedList;

public class ReverseLinkedList {
	public static void main(String[] args) {
		ReverseLinkedList ex = new ReverseLinkedList();
		
		List list1 = ex.new LinkedList();
		
		list1.insert(4);
		list1.insert(3);
		list1.insert(2);
		list1.insert(1);
		list1.reverse();
		list1.traverse();
	}
	
	class LinkedList implements List {

		// this is the head node or root node
		private Node root;
		private int numOfItems;
		
		@Override
		public void reverse() {
			Node prev = null;
			Node current = root;
			Node next;
			
			while (current != null) {
				next = current.getNextNode();
				current.setNextNode(prev);
				prev = current;
				current = next;
			}
			
			this.root = prev;
			
		}
		
		@Override
		public Node get(int index) {
		    
		    int counter = 0;
		    Node node = this.root;
		    
		    while(node != null) {
		        if(index == counter)
		            return node;
		        
		        counter++;
		        node = node.getNextNode();
		    }
		    
		    return null;
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
	    public Node get(int index);
	    public void reverse();
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
