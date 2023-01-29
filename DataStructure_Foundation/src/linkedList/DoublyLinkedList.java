package linkedList;

public class DoublyLinkedList {
	
	Node head;
	
	static class Node{
		int data;
		Node prev;
		Node next;
		Node(int d){
			data=d;
		}
	}
	
	public Node insertBegin(Node head,int data){
		Node temp = new Node(data);
		temp.next=head;
		if(head!=null)
			head.prev=temp;
		return temp;
	}
	
	public Node insertEnd(Node head,int data){
		Node temp = new Node(data);
		if(head==null) {
			return temp;
		}
		Node cur=head;
		while(cur.next!=null) 
			cur=cur.next;
		
		cur.next=temp;
		temp.prev=cur;
		return head;
	}
	
	public Node deleteHead(Node head) {
		if(head==null || head.next==null)
			return null;
		head=head.next;
		head.prev=null;
		return head;
	}
	
	public Node deleteLast(Node head) {
		if(head==null || head.next==null)
			return null;
		Node cur = head;
		while(cur.next!=null)
			cur=cur.next;
		
		cur.prev.next=null;
		
	 	return head;
	}
	
	public Node reverse(Node head) {
		if(head==null || head.next==null)
			return head;
		
//		Node prev = null;
//		Node cur=head;
//		Node next=null;
//		while(cur!=null) {
//			next = cur.next;
//			cur.prev=next;
//			cur.next=prev;
//			prev=cur;
//			cur=next;
//		}
//		head=prev;
		Node temp = null;
		Node cur=head;
		
		while(cur!=null) {
			temp = cur.prev;
			cur.prev=cur.next;
			cur.next=temp;
			cur=cur.prev;
		}
		
		return temp.prev;
	}
	
	public void display() {
		Node cur = head;
		while(cur!=null) {
			System.out.print(cur.data+" -> ");
			cur=cur.next;
		}
		System.out.println("null");
	}
	
	public static void main(String[] args) {
		DoublyLinkedList dll = new DoublyLinkedList();
		dll.head=dll.insertBegin(dll.head, 30);
		dll.head=dll.insertBegin(dll.head, 20);
		dll.head=dll.insertBegin(dll.head, 10);
		dll.display();
//		dll.head=dll.insertEnd(dll.head, 30);
//		dll.head=dll.insertEnd(dll.head, 20);

		dll.head= dll.reverse(dll.head);
		dll.display();
	}

}
