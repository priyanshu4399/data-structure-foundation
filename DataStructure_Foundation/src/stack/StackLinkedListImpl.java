package stack;

class Node{
	int data;
	Node next;
	
	Node(int d){
		data = d;
	}
}
public class StackLinkedListImpl {
	
	Node head;
	int count;

	public void push (int data) {
		Node temp = new Node(data);
		temp.next=head;
		head=temp;
		count++;
	}
	
	public int pop() {
		if(head==null) {
			System.out.println("UnderFlow error");
			return Integer.MAX_VALUE;
		}
		int data = head.data;
		head=head.next;
		count--;
		return data;
	}
	
	public int peek() {
		if(head==null) {
			System.out.println("Stack is Empty");
			return Integer.MAX_VALUE;
		}
		return head.data;
	}
	
	public int size() {
		return count;
	}
	public boolean isEmpty() {
		return head==null;
	}
	
	public void display(){
		if(head==null) 
			System.out.println("Stack is Empty");
		else {
			Node cur = head;
			while(cur!=null) {
				System.out.println(cur.data);
				cur = cur.next;
			}
		}
	}

	public static void main(String[] args) {
		StackLinkedListImpl stack = new StackLinkedListImpl();
		stack.push(10);
		stack.push(20);
		stack.push(30);
		System.out.println("Stack items are : ");
		stack.display();
		System.out.println("Popped item : "+stack.pop());
		System.out.println("Stack items are : ");
		stack.display();
		System.out.println("Item at the top is : "+stack.peek());
		System.out.println("Size : " +stack.size());
		System.out.println("Is stack Empty : "+ stack.isEmpty());
	}

}
