/**
 * GenericLinkedList.java is a generic version of LinkedList.java 
 * @author Jared Rosenberger
 * @version 9/1/22
 * GenericLinkedList.java
 * Fall 2022
 */
public class GenericLinkedList<T> {	
	//Instance Variables
	private GenericNode<T> head; //head is the first node in the list
	private Integer length; //length is a counter to tell the user how many nodes are in the list
	private GenericNode<T> tail; //tail is the last node in the list
	
	//Constructors
	/**
	 * The no argument constructor initializes instance variables
	 */
	public GenericLinkedList() {
		head=null;
		length=0;
		tail=head;
	}//end constructor
	
	//Accessors and Mutators
	/**
	 * 
	 * @return the current value of head
	 */
	public GenericNode<T> getList() {
		return head;
	}//end getList()
	
	//Other Class Methods
	/**
	 * isEmpty() returns true if the list is empty, and false if the list is not
	 * @return boolean
	 */
	public boolean isEmpty() {
		if(head==null){ 
			return true;
		}
		else return false;
	}//end isEmpty()
	/**
	 * addNode() allows the user to add nodes to the end of the list
	 * @param aNode the value of the node being added to the list, as passed into addNode()
	 */
	public void addNode(GenericNode<T> aNode) {
		if (isEmpty()) {
			head = aNode;
			tail=head;
			return;
		}			
		tail.setNextNode(aNode);
		tail=tail.getNextNode();
		tail.setNextNode(null);			
		length++;
	}//end addNode()
}//end GenericLinkedList.java