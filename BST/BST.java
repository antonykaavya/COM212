/*
Kaavya Antony
COM 212
4/11/16
Programming Assignment 6: Binary Search Tree
*/

public class BST{

	//instance variables
	private Node t;
	private Node parent;
	private Node successor;

	//constructor
	public BST(){
		Node t = null;
	}

	//returns true if the tree is empty, false is the tree is not empty
	public boolean isEmptyTree(){
		return t == null;
	}

	//search function, searches to see if the tree is empty, if not, calls the search2 function to continue the search 
	public Node search(int key){
		if (t == null){
			return null;
		}
		else{
			return search2(t, key);
		}
	}

	//search2 function, searches to see if the key of a node is in the tree
	private Node search2(Node temp, int key){
		if (temp == null){
			return null;
		}
		else if (key == temp.getKey()){
			return temp;
		}
		else if (key < temp.getKey()){
			return search2(temp.getLeft(), key);
		}
		else{
			return search2(temp.getRight(), key);
		}
	}

	//insert function, if the tree is empty, inserts p as the root, t, if not, calls the insert2 function 
	public void insert(Node p){
		if (t == null){
			t = p;
		}
		else{
			insert2(t, p);
		}
	}

	//inserts node pointed to by p, in the correct position
        private void insert2(Node t, Node p){
		if (p.getKey() < t.getKey()){
			if (t.getLeft() == null){
				t.setLeft(p);
			}
			else{
				insert2(t.getLeft(), p);
			}
		}
		else{
			if (t.getRight() == null){
				t.setRight(p);
			}
			else{
				insert2(t.getRight(), p);
			}
		}
	}

    //findSuccessor(), finds the closest number to the node that is greater than the node
    public Node findSuccessor(Node p){
		Node temp = p.getRight();
		while (temp.getLeft() != null){
			temp = temp.getLeft();
		}
		parent = getParent(temp);
		if (parent != p){
			parent.setLeft(temp.getRight());

		}
		return temp;
	}

    //getParent(), finds the parent of the node 
	public Node getParent(Node p){
		Node temp = t;
		while (temp.getLeft() != p && temp.getRight() != p){
			if (temp.getKey() > p.getKey()){
				temp = temp.getLeft();
			}
			else{
				temp = temp.getRight();
			}
		}
		return temp;
	}
    
    //returns true if the child is left of the parent, false if the child is right of the parent
	public boolean isLeft(Node parent, Node child){
		if (parent.getLeft() == child){
			return true;
		}
		else{
			return false;
		}
	}

    //deletes a node that is a leaf, has no children
	public void deleteLeaf(Node p){
		parent = getParent(p);
		//if the node that is being deleted is on the left side of the parent
		if (isLeft(parent, p)){
			parent.setLeft(null);
		}
		//if the node that is being deleted is on the right side of the parent
		else{
			parent.setRight(null);
		}
	}

    //delete a parent node with a single child
	public void deleteSingleParent(Node p){
		//if the node that is being deleted is on the left side of the parent
		if (isLeft(parent, p)){
			t.setLeft(p.getLeft());
			p.setLeft(null);
		}
		//if the node that is being deleted is on the right side of the parent
		else{
			t.setRight(p.getRight());
			p.setRight(null);
		}
	}

    //deletes a parent node with two children
    public void deleteDoubleParent(Node p){
    	successor = findSuccessor(p);
    	parent = getParent(p);
    	//if the child is left of the parent
    	if (isLeft(parent, p)){
    		//set the parent's left child to successor
    		parent.setLeft(successor);
    	}
    	//if the child is right of the parent
    	else{
    		//set the parent's right child to successor
    		parent.setRight(successor);
    	}
    	successor.setLeft(p.getLeft());
    	if (p.getRight() != successor){
			successor.setRight(p.getRight());
		}
    }

    //delete the root of the BST
    public void deleteRoot(){
    	//if the root is a leaf
		if (t.getLeft() == null && t.getRight() == null){
			t = null;
		}
		//if the root only has one child
		else if (t.getLeft() == null || t.getRight() == null){
			if (t.getLeft() == null){
				t = t.getRight();
			}
			else{
				t = t.getLeft();
			}
		}
		//if the root has two children
		else{
			successor = findSuccessor(t);
			successor.setLeft(t.getLeft());
			if (t.getRight() == successor){
				successor.setRight(null);
			}
			else{
				successor.setRight(t.getRight());
			}
			t = successor;

		}
    }
    
    //delete function
    public void delete(Node p){
    	//if the node that needs to be deleted is the root
	    if (p == t){
			deleteRoot();
	    }
	    //if the node that needs to be deleted is a leaf
	    else if (p.getLeft() == null && p.getRight() == null){
			deleteLeaf(p);
	    }
	    //if the node that needs to be deleted has one child
	    else if (p.getLeft() == null || p.getRight() == null){
			deleteSingleParent(p);
	    }
	    //if the node that needs to be deleted has two children
	    else{
			deleteDoubleParent(p);
	    }
	    
    }

    //prints the keys all in a single line
    public void traverse(){
    	if (t != null){
    		traverse2(t.getLeft());
    		System.out.print(t.getKey() + " ");
    		traverse2(t.getRight());
    	}
    }

    //helper function for the traverse function
    public void traverse2(Node x){
    	if (x != null){
    		traverse2(x.getLeft());
    		System.out.print(x.getKey() + " ");
    		traverse2(x.getRight());
    	}
    }

    //prints the tree in a detailed fashion, indicating the left and right child of each node, if any
	public void printTree(){
		System.out.println();
		printTree2(t);
		System.out.println();
    }

    //helper function for printing the tree details
    private void printTree2(Node t){
		if (t != null) {
	    	System.out.print(t.getKey() + " ");
        	if (t.getLeft() != null)
	    		System.out.print("Left: " + t.getLeft().getKey() + " ");
        	else
            	System.out.print("Left: null ");
        	if (t.getRight() != null)
	        	System.out.println("Right: " + t.getRight().getKey() + " ");
        	else
            	System.out.println("Right: null ");
	    	printTree2(t.getLeft());
	    	printTree2(t.getRight());
		}
    }
}