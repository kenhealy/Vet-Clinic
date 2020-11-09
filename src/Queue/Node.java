package Queue;

public class Node {

	//each node holds some data and the location of the next node
	private Object nodeData;
	private Node nextNode;
	
	public Node(Object someData) {
		
		this.nodeData = someData;
		this.nextNode = null;
		
	}
	
	//return location of the next node
	public Node next() {
		
		return this.nextNode;
	}
	
	//set location of the next node
	public void setNextNode(Node someNode) {
		
		this.nextNode = someNode;
	}
	
	//return data stored in this node
	public Object retrieveData() {
		
		return this.nodeData;
	}

}
