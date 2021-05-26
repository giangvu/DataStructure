package heap;

/**
 * This class represents a max-heap (priority queue)
 * 
 * @author giang.vu
 *
 */
public class Heap {
	
	private static int INVALID_INDEX = 1;

	private int[] elements;
	
	public Heap(int[] elements) {
		if (elements == null) {
			throw new IllegalArgumentException("elements should not be null");
		}
		
		this.elements = elements.clone();
	}
	
	private void buildMaxHeap() {
		// TODO: input validation
		// TODO: handle edge cases

		
		
	}

	private int getLeftChildIndex(int index) {
		int left = index * 2 + 1;
		if (left >= Size()) {
			return INVALID_INDEX;
		}
		
		return left;
	}
	
	private int getRightChildIndex(int index) {
		int right = index * 2 + 2;
		if (right >= Size()) {
			return INVALID_INDEX;
		}
		
		return right;
		
	}
	
	private int getParentIndex(int index) {
		if (index == 0) {
			// root index
			return INVALID_INDEX;
		}
		
		return (index - 1) / 2;
	}
	
	private void swap(int i, int j) {
		int tmp = elements[i];
		elements[i] = elements[j];
		elements[j] = tmp;
	}
	
	private void heapify(int index) {
		int leftChildIndex = getLeftChildIndex(index);
		int rightChildIndex = getRightChildIndex(index);
	}
	
	public void Add() {
		
	}
	
	public int Pop() {
		int max = elements[0];
		
		return max;
	}
	
	public int Size() {
		return elements.length;
	}

	public int Max() {
		return elements[0];
	}
	
	public static void main(String[] args) {
		System.out.print("aaaaaaaaa");
	}
}
