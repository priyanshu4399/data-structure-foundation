package linkedList;

public class CircularDoublyLinkedList {
	Node head;
	
	static class Node{
		int data;
		Node prev;
		Node next;
		Node(int d){
			data = d;
		}
	}
	
	void display() {
		if(head==null) return;
		System.out.print(head.data+"->");
		for(Node cur = head.next;cur!=head;cur=cur.next)
			System.out.print(cur.data+"->");
		System.out.println("null");
	}
	
	Node insetBeg(Node head,int data) {
		Node temp = new Node(data);
		if(head==null) {
			temp.prev=temp;
			temp.next=temp;
			return temp;
		}
		temp.prev=head.prev;
		temp.next=head;
		head.prev.next=temp;
		head.prev=temp;
		return temp;
	}
	
	Node insetEnd(Node head,int data) {
		Node temp = new Node(data);
		if(head==null) {
			temp.prev=temp;
			temp.next=temp;
			return temp;
		}
		temp.prev=head.prev;
		temp.next=head;
		head.prev.next=temp;
		head.prev=temp;
		return head;
	}
	
	
	public static void main(String[] args) {
		CircularDoublyLinkedList cdll = new CircularDoublyLinkedList();
		cdll.head = cdll.insetBeg(cdll.head, 30);
		cdll.head = cdll.insetBeg(cdll.head, 20);
		cdll.head = cdll.insetBeg(cdll.head, 10);
		cdll.display();
	}

}
