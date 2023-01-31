package deque;
/* In this implementation size var is not maintained as it can be calculated from front & rear. 
 * Also Line of Code is reduced.
 * */
public class DequeCirArrayImpl2 {
	int[] arr;
	int cap,front,rear;
	
	DequeCirArrayImpl2(int c){
		front=rear=-1;
		cap = c;
		arr = new int[cap];
	}
	
	boolean isFull() {
		return size()==cap;
	}
	
	boolean isEmpty() {
		return size()==0;
	}
	
	void insertFront(int data){
		if(isFull()) {
			System.out.println("Overflow Error");
			return;
		}
		if(isEmpty()) 
			front=rear=0;
		else
			front=(front+cap-1)%cap;
		arr[front]=data;
	}
	
	void insertRear(int data){
		if(isFull()) {
			System.out.println("Overflow Error");
			return;
		}
		if(isEmpty())
			front=0;
		rear=(rear+1)%cap;
		arr[rear]=data;
	}
	
	void deleteFront() {
		if(isEmpty()) {
			System.out.println("Underflow Error");
			return;
		}
		if(front==rear) 
			front=rear=-1;
		else
			front=(front+1)%cap;

	}
	
	void deleteRear() {
		if(isEmpty()) {
			System.out.println("Underflow Error");
			return;
		}
		if(front==rear) 
			front=rear=-1;
		else
			rear=(rear-1+cap)%cap;
	}
	
	int getFront() {
		if(isEmpty()) {
			return -1;
		}
		return arr[front];
	}
	
	int getRear() {
		if(isEmpty()) {
			return -1;
		}
		return arr[rear];
	}

	int size() {
		return (rear-front+1+cap)%cap;
	}
	
	void display() {
		if(isEmpty()) {
			System.out.println("Queue is Empty");
			return;
		}
		System.out.println("Queue items are : ");
		if(rear>=front) {
			for(int i=front;i<=rear;i++) {
				System.out.println(arr[i]);
			}
		}
		else {
			for(int i=front;i<cap;i++) {
				System.out.println(arr[i]);
			}
			for(int i=0;i<=rear;i++) {
				System.out.println(arr[i]);
			}
		}
	}
	
	public static void main(String[] args) {
		DequeCirArrayImpl2 deque = new DequeCirArrayImpl2(3);
		deque.insertRear(20);
		deque.insertRear(30);
		deque.insertFront(10);
		deque.display();
		System.out.println("Is Queue Full : "+ deque.isFull());
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
