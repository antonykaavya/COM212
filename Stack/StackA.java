/*
Kaavya Antony
COM 212
Programming Assignment 4A: Stack Class using Array
*/

public class StackA{

	//instance variables
	private int n;
	private Node[] stack;
	private Node head;

	//constructor
	public StackA(){
		n = 0;
		stack = new Node[100];
	}

	//returns the last node of the stack
	public Node top(){
		if (isEmpty()){
			return null;
		}
		else{
			return stack[n-1];
		}
	}

	//returns and removes the last node of the stack
	public Node pop(){
		n --;
		return stack[n];
	}

	//adds x, a node as an element of the stack
	public void push(Node x){
		stack[n] = x;
		n++;
	}

	//returns true if stack is empty, false if stack is not
	public boolean isEmpty(){
		return n == 0;
	}

	//prints the stack in order
	public void printStack(){
		System.out.println(n);
		for(int i = n-1; i >= 0; i--) {
			System.out.println(stack[i].getKey());
		}
	}


	

}
