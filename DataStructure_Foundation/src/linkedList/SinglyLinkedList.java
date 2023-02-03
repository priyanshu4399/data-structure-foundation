package linkedList;


public class SinglyLinkedList {
	
	Node head;
	
	static class Node{
		int data;
		Node next;
		
	    Node(int data) {
			this.data= data;		
			this.next = null;
		}
	}
	
	public int length() {
		int count = 0;
		if(head==null) {
			return count;
		}
		Node cur = head;
		while(cur!=null) {
			count++;
			cur=cur.next;
		}
		return count;
	}
	public void display() {
		if(head==null) {
			System.out.println("List is Empty");
			return;
		}
		Node temp = head;
		while(temp!=null) {
			System.out.print(temp.data+" -> ");
			temp=temp.next;
		}
		
		System.out.println("Null");
	}
	
	public void insertFirst(int data) {
		Node newNode = new Node(data);
		newNode.next=head;
		head = newNode;
		
	}
	
	
	public void insertLast(int data) {
		Node newNode = new Node(data);
		if(head==null) {
			head = newNode;
			return;
		}
		Node cur = head;
		while(cur.next!=null) {
			cur=cur.next;
		}
		cur.next=newNode;

	}
	
	public void insert(int pos,int data) {
		
		if(pos<1 || pos>length()+1) {
			System.out.println("Invalid postion");
			return;
	    }
		Node newNode = new Node(data);
		
		if(pos==1) {
			newNode.next=head;
			head = newNode;
			return;
		}
		else{
			Node prev = head;
			for(int i=1;i<pos-1;i++) {
				prev=prev.next;
			}
			newNode.next=prev.next;
			prev.next=newNode;
		}
		
	}
	
	public Node deleteFirst() {
		if(head==null) 
			return head;
		Node temp = head;
		head = head.next;
		return temp;
	}
	public Node deleteLast() {
		if(head==null) {
			return head;
		}
		if(head.next==null) {
			Node temp = head;
			head = null;
			return temp;
		} 
		 
		Node cur = head;
		Node prev = null;
		while(cur.next!=null) {
			prev=cur;
			cur=cur.next;
		}
		
		prev.next=null;
		return cur;
	}
	
	public Node deleteAt(int pos) {
		if(pos<1 || pos>length()) {
			System.out.println("Invalid Position");
			return null;
		}
		if(pos==1) {
			Node temp = head;
			head = head.next;
			return temp;
		}
		Node prev = head;
		for(int i=1;i<pos-1;i++) {
			prev = prev.next;
		}
	    Node cur = prev.next;
		prev.next=cur.next;
		cur.next=null;
		return cur;
	}
	
	public boolean contains(int key) {
		Node cur = head;
		while(cur!=null) {
			if(cur.data==key)
				return true;
		}
		return false;
	}
	
	
	
	public static Node mergeTwoSinglyLinkedList(Node a, Node b) {
		Node dummy = new Node(0);
		//Node tail = dummy;
		
		Node tail = dummy;
		while(a!=null && b!=null ) {
			
			if(a.data <= b.data){
				tail.next = a;
				a=a.next;
			}
			else {
				tail.next = b;
				b=b.next;
			}
			tail=tail.next;
		}
		if(a==null)
			tail.next = b;
		else
			tail.next = a;
		//return dummy.next;
		return tail;
	}

	public static void main(String[] args) {
		SinglyLinkedList l = new SinglyLinkedList();
		l.insertFirst(3);
		l.insertFirst(2);
		l.insertFirst(1);
		l.insertLast(4);
		l.insertLast(5);
//		l.insert(1, 0);
//		l.insert(2, 1);
		
      	l.display();
//		System.out.println(l.deleteFirst().data);
//		l.display();
//		l.deleteLast();
//		l.display();
//		l.deleteAt(1);
//     	System.out.println(l.contains(1));
      	
      	//l.display();
	}

}
