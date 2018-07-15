/*
Kaavya Antony
COM 212
4/11/16
Programming Assignment 6: Node Class adjusted for BST
*/

public class Node{


	//instance variables 
	private String name;
	private int SSN;
	private Node left;
	private Node right;
	
	//constructor
	public Node(String name0, int SSN0){
		name = name0;
		SSN = SSN0;
		}
		
	//sets the node x equal to right
	public void setRight(Node x){
		right = x;
		}
		
	//sets the node x equal to left
	public void setLeft(Node x){
		left = x;
	}

	//returns the right node 
	public Node getRight(){
		return right;
		}

	//returns the left node
	public Node getLeft(){
		return left;
	}
	
	//assigns the SSN to the student 
	public void setSSN(int SSN0){
		SSN = SSN0;
		}
	
	//returns the entire SSN of the student
	public int getSSN(){
		return SSN;
		}
	//returns the last 4 digits of the student's SSN
	public int getKey(){
		return (SSN % 10000);
		}
	
	//sets the name of the student
	public void setName(String name0){
		name = name0;
		}
		
	//returns the name of the student
	public String getName(){
		return name;
		}
	

	}

