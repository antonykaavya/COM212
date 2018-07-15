/*
Kaavya Antony
COM 212
4/13/16
Programming Assignment 7: Hash Tables
*/

public class Hash{

	//instance variables
	private int n;
	private Node[] hash;
	private int maxSize;
	private Node temp;
	private Node temp2;
	private int p;
	private int p2;
	private int j;

	//constructor
	public Hash(){
		n = 0;
		maxSize = 7;
		hash = new Node[maxSize];
	}

	//returns true if the set is empty, false if it is not
	public boolean isEmptySet(){
		return n == 0;
	}

	//returns the position where the node should be inserted based on the key
	public int hash(int key){
		int position = key % maxSize;
		return position;
	}

	//returns a second position where the node should be inserted if the first position is inserted
	public int hash2(int key){
		int position2 = (key % 5) + 1;
		return position2;
	}

	//inserts Node x into the set
	public void insert(Node x){
		int key = x.getKey();
		int p = hash(key);
		if (n == maxSize){
			System.out.println("The hash table is full.");
		}
		else if (hash[p] == null){
			hash[p] = x;
			n++;
		}
		else{
			p2 = (hash2(key) + hash(key)) % maxSize;
			while (hash[p2] != null){
				p2 = (hash2(key) + p2) % maxSize;
				j++;
			}
			hash[p2] = x;
			n++;
		}
	}

	//returns the node with the key given
	public Node lookUp(int key){
		p = hash(key);
		p2 = p;
		temp = hash[p];
		int i = 0;
		while ((temp == null || temp.getKey() != key) && i < maxSize){
			p2 = (hash2(key) + p2) % maxSize;
			temp2 = hash[p2];
			if (temp2 != null){
				if (temp2.getKey() == key){
					return temp2;
				}
			}
			temp = temp2;
			i++;
		}
		if (i < maxSize){
			return temp;
		}
		else{
			System.out.println("The node is not in the hash table.");
			return null;
		}
	}

	public void delete(int key){
		p = hash(key);
		temp = hash[p];
		if (temp != null && temp.getKey() == key){
			hash[p] = null;
		}
		else{
			int p2 = (hash2(key) + hash(key)) % maxSize;
			while(hash[p2] == null || hash[p2].getKey() != key){
				p2 = (hash2(key) + p2) % maxSize;
			}
			hash[p2] = null;
		}
		n--;
	}

	public void printContents(){
		for(int i = 0; i < maxSize; i++){
			if(hash[i] == null){
				System.out.println("[null]");
			}
			else{
				System.out.println("["  + hash[i].getKey() + "] ");
			}
		}
		System.out.println();

	}
}