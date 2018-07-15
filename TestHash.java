//Test code for Hash Table
//Kaavya Antony

public class TestHash {
    public static void main(String[] args){
		Hash hash = new Hash();
		System.out.println("isEmpty = " + hash.isEmptySet());
		Node aNode = new Node("Jane", 546374633);
		Node bNode = new Node("Joe", 123456789);
		Node cNode = new Node("Jack", 112233445);
		Node dNode = new Node("Jill", 987654321);
		Node eNode = new Node("Abe", 345938457);
		Node fNode = new Node("Beth", 234823489);
		Node kNode = new Node("Kate", 643479234);
		Node jNode = new Node("Julia", 945395354);
		Node hNode = new Node("Dot", 784583975);
		Node lNode = new Node("Bob", 823059323);

		hash.insert(aNode);
		hash.insert(bNode);
		hash.insert(cNode);
		hash.insert(dNode);

		hash.printContents();

		hash.insert(eNode);
		hash.insert(fNode);
		hash.insert(lNode);

		hash.printContents();

		hash.insert(hNode);
		hash.insert(kNode);
		hash.insert(jNode);

		hash.delete(4633);
		hash.delete(6789);

		hash.printContents();

		hash.delete(8457);
		hash.delete(3489);

		hash.lookUp(4633);
		hash.lookUp(4140);
		hash.lookUp(3975);

		System.out.println("isEmpty = " + hash.isEmptySet());
		System.out.println("isEmpty = " + hash.isEmptySet());

		hash.printContents();





	}
}