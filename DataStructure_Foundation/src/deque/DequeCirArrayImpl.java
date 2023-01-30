package deque;
public class DequeCirArrayImpl {
	int[] arr;
	int cap,size,front,rear;
	
	DequeCirArrayImpl(int c){
		front=rear=-1;
		cap = c;
		size=0;
		arr = new int[cap];
	}
	
	boolean isFull() {
		return size==cap;
	}
	
	boolean isEmpty() {
		return size==0;
	}
	
	void insertFront(int data){
		if(isFull()) {
			System.out.println("Overflow Error");
			return;
		}
		if(isEmpty()) {
			front=rear=0;
			arr[front]=data;
			size++;
			return;
		}
		if(front==0) {
			front=cap-1;
			arr[front]=data;
			size++;
			return;
		}
		
		arr[--front]=data;
		size++;
		
	}
	
	void insertRear(int data){
		if(isFull()) {
			System.out.println("Overflow Error");
			return;
		}
		rear=(rear+1)%cap;
		arr[rear]=data;
		if(front==-1)
			front=0;
		size++;
	}
	
	void deleteFront() {
		if(isEmpty()) {
			System.out.println("Underflow Error");
		}
		if(front==rear) {
			front=rear=-1;
			size=0;
			return;
		}
		front=(front+1)%cap;
		size--;
	}
	
	void deleteRear() {
		if(isEmpty()) {
			System.out.println("Underflow Error");
		}
		
		if(front==rear) {
			front=rear=-1;
			size=0;
			return;
		}
		if(rear==0) {
			rear=cap-1;
			size--;
			return;
		}
		rear--;
		size--;
	}
	
	int getFront() {
		if(isEmpty()) {
			return -1;
		}
		return front;
	}
	
	int getRear() {
		if(isEmpty()) {
			return -1;
		}
		return rear;
	}

	int size() {
		return size;
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
		DequeCirArrayImpl queue = new DequeCirArrayImpl(10);
		queue.insertFront(10);
		queue.insertFront(20);
		queue.insertFront(30);
	    queue.display();
		queue.deleteRear();
		queue.display();
		System.out.println("Item at the front is : "+queue.getFront());
		System.out.println("Item at the rear is : "+queue.getRear());
		System.out.println("Size : " +queue.size());
		System.out.println("Is Queue Full : "+ queue.isFull());
		System.out.println("Is Queue Empty : "+ queue.isEmpty());
		queue.display();
	}
	
}
