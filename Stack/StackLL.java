/*
Kaavya Antony
COM 212
Programming Assignment 4B: Stack Class using Linked List
*/

public class StackLL{

	//instance variables
	private Node s;
	private int n;

	//constructor
	public StackLL(){
		s = null;
	}

	//returns the last node of the stack
	public Node top(){
		return s;
	}

	//returns and removes the last node of the stack
	public Node pop(){
		Node temp = s;
		s = s.getNext();
		temp.setNext(null);
		n--;
		return temp;
	}

	//adds x, a node as an element of the stack
	public void push(Node x){
		x.setNext(s);
		s = x;
		n++;
	}

	//returns true if stack is empty, false if stack is not
	public boolean isEmpty(){
		return s == null;
	}
	
	//prints the stack in order
	public void printStack() {
		System.out.println(n);
		Node temp = s;
		while (temp != null) {
			System.out.println(temp.getKey());
			temp = temp.getNext();
		}
	}
}