package queue;

//In this Implementation 
//rear = (front + size-1)% cap
public class QueueCirArrayImpl {
	int[] arr;
	int cap,size,front,rear;
	
	QueueCirArrayImpl(int c){
		front=rear=-1;
		cap = c;
		size=0;
		arr = new int[cap];
	}
	
	boolean isFull() {
		return size==cap;
	}
	
	boolean isEmpty() {
		return rear==-1;
	}
	
	void enque(int data){
		if(isFull()) {
			System.out.println("Overflow Error");
			return;
		}
		if(front==-1)
			front=0;
		rear=(rear+1)%cap;
		arr[rear]=data;
		size++;
	}
	
	void deque() {
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
			for(int i=front;i<size;i++) {
				System.out.println(arr[i]);
			}
			for(int i=0;i<=rear;i++) {
				System.out.println(arr[i]);
			}
		}
		
		
	}
	
	public static void main(String[] args) {
		QueueCirArrayImpl queue = new QueueCirArrayImpl(10);
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
