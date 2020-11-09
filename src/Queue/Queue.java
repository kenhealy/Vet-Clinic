package Queue;

import Exceptions.EmptyQueueException;

public class Queue {

	private Node head;
	private Node tail;
	private int queueLength;
	
	public Queue() {
		
		this.head = null;
		this.tail =  null;
		this.queueLength =0;
	}

	//create a node to store @param data and add it to the end of the queue
	public void add(Object data) {
		
		Node someNode = new Node(data);
		
		if (isEmpty() ) {
			//special case - the queue is empty so new node goes at the front
			this.head = someNode;
			this.tail = someNode;
			this.head.setNextNode(this.tail);
			
		}else {
		
			this.tail.setNextNode(someNode);
			this.tail = someNode;
			
		}
		
		this.queueLength++;
	}
	
	//@return the data stored in the head node
	public Object remove() throws EmptyQueueException{
		
		try {
				Node someNode = this.head;
				
				if (this.length() > 1)
					this.head = this.head.next();
				
				else if (this.length() == 1) {
					
					//this is the last item in the queue
					this.head = null;
					this.tail = null;
				}
				this.queueLength--;
		
				return someNode.retrieveData();
				
		} catch (NullPointerException e) {
			
			throw new EmptyQueueException();
		}
	}
	
	public int length() {
		
		return this.queueLength;
	}
	
	public boolean isEmpty() {
	
		return this.queueLength == 0;
	}
}
