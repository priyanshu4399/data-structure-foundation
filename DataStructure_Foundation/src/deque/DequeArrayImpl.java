package deque;

/* In this implementation 
 * front = 0
 * rear = size-1;
 * when deque is non empty
 * */
public class DequeArrayImpl {
	
	int size,cap;
	int[] arr;
	
	DequeArrayImpl(int c){
		cap = c;
		size = 0;
		arr = new int[cap];
	}
	//O(N)
	void insertFront(int data) {
		if(isFull()) {
			System.out.println("Deque is full");
			return;
		}
		for(int i=size;i>0;i--) {
			arr[i]=arr[i-1];
		}
		arr[0]=data;
		size++;
	}
	
	void insertRear(int data) {
		if(isFull()) {
			System.out.println("Deque is full");
			return;
		}
		arr[size++]=data;
	}
	
	//O(n)
	void deleteFront() {
		if(isEmpty()) {
			System.out.println("Deque is already Empty");
			return;
		}
		for(int i=0;i<size-1;i++) {
			arr[i]=arr[i+1];
		}
		size--;
	}
	
	void deleteRear() {
		if(isEmpty()) {
			System.out.println("Deque is already Empty");
			return;
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
	
	boolean isEmpty() {
		return size==0;
	}
	
	boolean isFull() {
		return size==cap;
	}
	
	int size() {
		return size;
	}
	
	void display() {
		if(isEmpty())
			System.out.println("Deque is Empty");
		System.out.println("Deque Items are : ");
		for(int i=0;i<size;i++) {
			System.out.println(arr[i]);
		}
	}
	
	public static void main(String[] args) {
		DequeArrayImpl deque = new DequeArrayImpl(10);
		System.out.println("Is Deque is Empty : "+deque.isEmpty());
		deque.insertFront(10);
		deque.insertFront(20);
		deque.insertFront(30);
		deque.insertRear(40);
		deque.insertRear(50);
		deque.display();
		deque.deleteFront();
		deque.display();
		deque.deleteRear();
		deque.display();
		System.out.println("No of items in deque are : " + deque.size());
		
	}
	
}
