/*
Kaavya Antony
COM 212
Programming Assignment 5A: Queue Class using Array
*/

public class QueueA{

	//instance variables
	private int front;
	private int n;
	private Node[] queue;
	private int tail;

	//constructor
	public QueueA(){
		front = 0;
		n = 0;
		queue = new Node[100];
	}

	//returns the first node
	public Node front(){
		if (isEmpty()){
			return null;
		}
		else{
			return queue[front];
		}
	}

	//returns the first node and then removes it
	public Node dequeue(){
		int temp = front;
		front = (front + 1) % 100;
		n--;
		return queue[temp];
	}

	//adds a new node to the queue
	public void enqueue(Node x){
		tail = (front + n) % 100;
		queue[tail] = x;
		tail++;
		n++;
	}

	//returns true if the queue is empty, false if the queue isn't empty
	public boolean isEmpty(){
		return n == 0;
	}

	//prints the queue in order
	public void printQueue() {
        System.out.println(front);
        System.out.println(tail);
        if (front <= tail)
           for(int i = front; i < tail; i++) 
               System.out.println(queue[i].getKey());
        else {
           for(int i = front; i < 100; i++) 
               System.out.println(queue[i].getKey());          
           for(int i = 0; i < tail; i++) 
               System.out.println(queue[i].getKey());
        }          
    }



}