/**
 * Application.java tests the methods of GenericNode.java and GenericLinkedList.java
 * @author Jared Rosenberger
 * @version 9/1/22
 * Application.java
 * Fall 2022
 */
public class Application {

	public static void main(String[] args) {
		GenericLinkedList<Integer> myList = new GenericLinkedList<Integer>();

		GenericNode<Integer> aNode = new GenericNode();
		aNode.setData(1);
		myList.addNode(aNode);
		aNode = new GenericNode();
		aNode.setData(2);
		myList.addNode(aNode);
		
		GenericNode<Integer> tempnode = myList.getList();
		do {
			System.out.println(tempnode.getData());
			tempnode=tempnode.getNextNode();
		} while(tempnode!=null);
	}//end main()
}//end Application.java