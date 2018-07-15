/*
Kaavya Antony
COM 212
Programming Assignment 5B: Queue Class using Linked List
*/

public class QueueLL{

	//instance variables
	private Node f;
	private Node e;
	private int n;

	//constructor
	public QueueLL(){
		f = null;
		e = null;
	}

	//returns the first node
	public Node front(){
		if (isEmpty()){
			return null;
		}
		else{
			return f;
		}
	}

	//returns the first node and then removes it
	public Node dequeue(){
		Node temp = f;
		f = f.getNext();
		temp.setNext(null);
		n--;
		return temp;
	}

	//adds a new node to the queue
	public void enqueue(Node x){
		if (isEmpty()){
			f = x;
			e = x;
			n++;
		}
		else{
			e.setNext(x);
			e = x;
			n++;
		}
	}

	//returns true if the queue is empty, false if the queue isn't empty
	public boolean isEmpty(){
		return f == null;
	}

	//prints the queue in order
	public void printQueue() {
        System.out.println(n);
        Node temp = f;
        while (temp != null) {
            System.out.println(temp.getKey());
            temp = temp.getNext();
        }
    }


}