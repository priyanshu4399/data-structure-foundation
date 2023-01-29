package queue;

//In this Implementation 
//front :0
//rear : size-1
//when atleast one element in queue
public class QueueArrayImpl {
	int[] arr;
	int cap,size;
	
	QueueArrayImpl(int c){
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
	
	void enque(int data){
		if(isFull()) {
			System.out.println("Overflow Error");
			return;
		}
		arr[size++]=data;
	}
	
	void deque() {
		if(isEmpty()) {
			System.out.println("Underflow Error");
		}
		for(int i=0;i<size-1;i++) {
			arr[i]=arr[i+1];
		}
		size--;
	}
	
	int getFront() {
		if(isEmpty()) {
			return -1;
		}
		return arr[0];
	}
	
	int getRear() {
		if(isEmpty()) {
			return -1;
		}
		return arr[size-1];
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
		for(int i=0;i<size;i++) {
			System.out.println(arr[i]);
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
