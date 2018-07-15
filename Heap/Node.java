/*
Kaavya Antony
3/7/16
Programming Assignment 2: Nodes and Pointers
*/

public class Node{


	//instance variables 
	private String name;
	private int SSN;
	private Node leftChild;
	private Node rightChild;
	
	//constructor
	public Node(String name0, int SSN0){
		name = name0;
		SSN = SSN0;
		}

	//returns the left child
	public Node getLC(){
		return leftChild;
	}
	
	//returns the right child
	public Node getRC(){
		return rightChild;
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

