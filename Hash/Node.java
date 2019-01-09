/*
Kaavya Antony
3/7/16
Programming Assignment 2: Nodes and Pointers
*/

public class Node implements java.io.Serializable{


	//instance variables 
	private String name;
	private int SSN;
	private Node next;
	
	//constructor
	public Node(String name0, int SSN0){
		name = name0;
		SSN = SSN0;
		}
		
	//sets the node x equal to next
	public void setNext(Node x){
		next = x;
		}
		
	//returns the next node 
	public Node getNext(){
		return next;
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

