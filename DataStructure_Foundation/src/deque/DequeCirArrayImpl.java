package deque;
public class DequeCirArrayImpl {
	int[] arr;
	int cap,front,rear,size;
	
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
		if(isEmpty()) 
			front=rear=0;
		else if(front==0) 
			front=cap-1;
		else 
			front--;
		arr[front]=data;
		size++;
		
	}
	
	void insertRear(int data){
		if(isFull()) {
			System.out.println("Overflow Error");
			return;
		}
		if(isEmpty()) 
			front=rear=0;
		else if(rear==cap-1) 
			rear=0;
		else 
			rear++;
		arr[rear]=data;
		size++;
	}
	
	void deleteFront() {
		if(isEmpty()) {
			System.out.println("Underflow Error");
			return;
		}
		if(front==rear) {
			front=rear=-1;
		}
		else if(front==cap-1)
			front=0;
		else
			front++;
		size--;
	}
	
	void deleteRear() {
		if(isEmpty()) {
			System.out.println("Underflow Error");
			return;
		}
		if(front==rear) 
			front=rear=-1;
		if(rear==0) 
			rear=cap-1;
		else
			rear--;
		size--;
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
		DequeCirArrayImpl deque = new DequeCirArrayImpl(3);
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
