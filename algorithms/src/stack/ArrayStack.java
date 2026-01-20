package stack;

public class ArrayStack<T> {

	private T[] stack;
	private int count;
	
	public ArrayStack() {
		stack = (T[]) new Object[1];
	}
	
	public void push(T newData) {
		
		if (count == stack.length)
			resize(2*count);
		
		stack[count++] = newData;
	}

	public T pop() {
		
		if (isEmpty()) return null;
		
		T item = stack[--count];
		stack[count] = null;
		
		if (count > 0 && count == stack.length/4)
			resize(stack.length/2);
		
		return item;
	}
	
	public boolean isEmpty() {
		return count == 0;
	}
	
	public int size() {
		return count;
	}
	
	private void resize(int capacity) {
		
		System.out.println("Need to resize the array");
		
		T[] stackCopy = (T[]) new Object[capacity];
		
		for (int i=0; i<count; i++) {
			stackCopy[i] = stack[i];
		}
		
		stack = stackCopy;
	}
	
	
}
