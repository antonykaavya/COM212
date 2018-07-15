/*
Kaavya Antony
COM 212
4/19/16
Programming Assignment 8: Priority Queue/Heap
*/

public class Heap{
	private int n;
	private Node[] priorityQ;
	private int indexLC;
	private int indexRC;
	private int x;
	private int y;

	public Heap(){
		priorityQ = new Node[128];
		n = 0;
	}

	public boolean isEmpty(){
		return n == 0;
	}

	public Node findMin(){
		return priorityQ[0];
	}

	public void insert(Node x){
		int parent = getParent(n);
		if (isEmpty()){
			priorityQ[n] = x;
		}
		else{
			priorityQ[n] = x;
			int temp = n;
			int m = getParent(n);
			while (priorityQ[temp].getKey() < priorityQ[m].getKey()){
				swap(temp, m);
				temp = m;
				m = getParent(temp);

			}
		}
		n++;
	}

	public Node deleteMin(){
		n--;
		swap(0, n);
		int min = 0;
		int parent = min;
		int rightChild = (parent * 2) + 2;
		int leftChild = (parent * 2) + 1;
		while ((priorityQ[parent].getKey() > priorityQ[rightChild].getKey() && hasRight(rightChild) == true)|| (priorityQ[parent].getKey() > priorityQ[leftChild].getKey() && hasLeft(leftChild) == true)){
			if (priorityQ[leftChild].getKey() > priorityQ[rightChild].getKey()){
				swap(0, rightChild);
				parent = rightChild;
				rightChild = (parent * 2) + 2;
				leftChild = (parent * 2) + 1;
			}
			else{
				swap(0, leftChild);
				parent = leftChild;
				rightChild = (parent * 2) + 2;
				leftChild = (parent * 2) + 1;
			}
		}
		return priorityQ[n];
	}

	public int getParent(int x){
		int indexP = (x - 1) / 2;
		return indexP;
	}

	public void swap(int x, int y){
		Node temp = priorityQ[x];
		priorityQ[x] = priorityQ[y];
		priorityQ[y] = temp;
	}

	public boolean hasLeft(int leftChild){
		if (leftChild < n){
			return true;
		}
		else{
			return false;
		}
	}

	public boolean hasRight(int rightChild){
		if (rightChild < n){
			return true;
		}
		else{
			return false;
		}
	}

	public void printHeap(){
		for(int i = 0; i <= n; i++){
			if(priorityQ[i] == null){
				System.out.println("[null]");
			}
			else{
				System.out.println("["  + priorityQ[i].getKey() + "] ");
			}
		}
		System.out.println();

	}
}