package deque;

class Node{
	int data;
	Node prev;
	Node next;
	Node(int d){
		data=d;
	}
}
public class DequeBuildInImpl {
	Node front,rear;
	int size;
	
	boolean isEmpty(){ return front==null; }
	
	int size() { return size;};
	
	public void insertFront(int data){
		Node newNode = new Node(data);
		if(isEmpty()) {
			front=rear=newNode;
		}else {
			newNode.next=front;
			front.prev=newNode;
			front=newNode;
		}
		size++;
	}
	
	public void insertRear(int data){
		Node newNode = new Node(data);
		if(isEmpty()) {
			front=rear=newNode;
		}else {
			rear.next=newNode;
			newNode.prev=rear;
			rear=newNode;
		}
		size++;
	}
	
	public void deleteFront() {
		if(isEmpty()) {
			System.out.println("Deque is already Empty");
		}
		else if(front==rear) {
			front=rear=null;
		}
		else {
			front=front.next;
			front.prev=null;
		}
		size--;

	}
	
	public void deleteRear() {
		if(isEmpty()) {
			System.out.println("Deque is already Empty");
		}
		else if(front==rear) {
			front=rear=null;
		}else {
			rear=rear.prev;
			rear.next=null;
		}
	 	size--;
	}
	
	int getFront() {
		if(isEmpty()) {
			return -1;
		}
		return front.data;
	}
	
	int getRear(){
        if (isEmpty())
            return -1;
        return rear.data;
    }
	
	public void display() {
		Node cur = front;
		System.out.print("null");
		while(cur!=null) {
			System.out.print(" <-> " +cur.data+" <-> ");
			cur=cur.next;
		}
		System.out.println("null");
	}
	
	public static void main(String[] args) {
		DequeBuildInImpl deque = new DequeBuildInImpl();
		deque.insertRear(20);
		deque.insertRear(30);
		deque.insertFront(10);
		deque.display();
		deque.deleteFront();
		deque.display();
		System.out.println("Item at the front is : "+deque.getFront());
		System.out.println("Item at the rear is : "+deque.getRear());
		System.out.println("Size : " +deque.size());
		deque.deleteRear();
		deque.deleteRear();
		System.out.println("Is Queue Empty : "+ deque.isEmpty());
	}

}
