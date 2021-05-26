package heap;

public class DisjointSet {
	private int[] parents;
	
	public DisjointSet(int size) {
		parents = new int[size];
		for (int i = 0; i < size; i++) {
			parents[i] = i;
		}
	}
	
	public void union(int e1, int e2) {
		int parentE1 = find(e1);
		int parentE2 = find(e2);
		if (parentE1 != parentE2) {
			parents[parentE2] = parentE1;
		}
	}
	
	public int find(int e) {
		if (parents[e] != e) {
			parents[e] = find(parents[e]);
		}
		
		return parents[e];
	}
	
	
	public static void main(String[] args) {
		
	}
}

