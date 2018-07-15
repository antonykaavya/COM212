/* 
Kaavya Antony
3/7/16
Programming Assignment 3: Unordered Linked List
*/

public class List{
	//instance variables
	private int n;
	private Node head;
	
	//constructor
	public List(){
		n = 0;
		head = null;
	}
	
	//returns n
	public int length(){
		return n;
	}

	//returns true if the list is empty, false if it is not
	public boolean isEmptyList(){
		return head == null;
	}

	//returns a pointer to the node x where the key of x = key
	public Node searchReturn(int key){
		Node temp = head;
		while (temp != null){
			if (temp.getKey() == key){
				return temp;
			}
			temp = temp.getNext();
		}
		return null;
	}

	//returns a pointer to the node x where the key of x = key and removes x from the list
	public Node searchRemove(int key){
		Node temp1 = head;
		Node temp2 = head;
		if(head.getKey() == key){
			head = head.getNext();
			n--;
			return temp1;
		}
			
		while (temp2 != null){
			temp2 = temp2.getNext();
			if (temp2.getKey() == key){
				temp1.setNext(temp2.getNext());
				n --;
				return temp2;
			}
			else{
				temp1 = temp1.getNext();
			}
		}
		return null;
		
	}

	//inserts x into the list
	public void insert(Node x){
		x.setNext(head);
		head = x;
		n ++;
	}

	//prints the keys of each of the nodes of the list in the order they are in the list 
	public void printList(){
		Node temp = head;
		System.out.println(n);
		for (int i = 0; i<n; i++){
			System.out.println(temp.getKey());
			temp = temp.getNext();
			
		}
	}
} 


