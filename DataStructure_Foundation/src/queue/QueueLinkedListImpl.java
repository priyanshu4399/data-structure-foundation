package queue;
class Node{
		int data;
		Node next;
		
	    Node(int data) {
			this.data= data;		
			this.next = null;
		}
}
public class QueueLinkedListImpl{
	Node front,rear;
	int size;
	
	QueueLinkedListImpl(){
		front = rear = null;
		size=0;
	}
	
	boolean isEmpty() {
		return front==null;
	}
	
	void enque(int data) {
		Node temp = new Node(data);
		if(front==null) {
			front=rear=temp;
			return;
		}
		rear.next = temp;
		rear=temp;
		size++;
	}
	
	void deque() {
		if(isEmpty()) {
			System.out.println("Queue is Empty");
			return;
		}
	
		front=front.next;
		if(front==null)
			rear=null;
		size--;
	}
	
	int getFront() {
		if(isEmpty()) {
			return -1;
		}
		return front.data;
	}
	int getRear() {
		if(isEmpty()) {
			return -1;
		}
		return rear.data;
	}
	
	int getSize(){
		return size;
	}
	
	void display(Node head) {
		if(head==null) {
			System.out.println("Queue is Empty");
			return;
		}
		Node temp = head;
		while(temp!=null) {
			System.out.println(temp.data);
			temp=temp.next;
		}
	}
	
	public static void main(String[] args) {
		QueueArrayImpl queue = new QueueArrayImpl(10);
		queue.enque(10);
		queue.enque(20);
		queue.enque(30);
	    queue.display();
		queue.deque();
		queue.display();
		System.out.println("Item at the front is : "+queue.getFront());
		System.out.println("Item at the rear is : "+queue.getRear());
		System.out.println("Size : " +queue.size());
		System.out.println("Is Queue Full : "+ queue.isFull());
		System.out.println("Is Queue Empty : "+ queue.isEmpty());
		queue.display();
	}
}
