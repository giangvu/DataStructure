package heap;

import java.util.Stack;

public class Queue<T> {

	private Stack<T> stack1 = new Stack<T>();
	private Stack<T> stack2 = new Stack<T>();
	
	public Queue() {
		
	}
	
	public void add(T element) {
		stack1.add(element);
	}
	
	public T remove() {
		transfer();
		if (stack2.isEmpty()) {
			return null;
		}
		
		return stack2.pop();
	}
	
	public T element() {
		transfer();
		if (stack2.isEmpty()) {
			return null;
		}
		
		return stack2.peek();
	}
	
	private void transfer() {
		if (!stack2.isEmpty()) {
			return;
		}
		
		while (!stack1.isEmpty()) {
			stack2.add(stack1.pop());
		}
	}
	
	
	public static void main(String[] args) {
		Queue<Integer> q = new Queue<>();
		q.add(1);
		q.add(2);
		q.add(3);
		System.out.println(q.element());
		System.out.println(q.remove());
		q.add(4);
		System.out.println(q.remove());
		System.out.println(q.remove());
		System.out.println(q.remove());
	}

}
