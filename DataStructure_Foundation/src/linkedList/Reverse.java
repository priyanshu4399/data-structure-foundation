package linkedList;

import linkedList.SinglyLinkedList.Node;

public class Reverse {
	public static Node reverse(Node head) {
		Node prev = null;
		Node cur = head;
		Node next = null;
		while(cur!=null) {
			next=cur.next;
			cur.next=prev;
			prev=cur;
			cur=next;
		}
		head = prev;
		return head;
	}
	
	public static Node reverse2(Node head) {
		if(head==null || head.next==null) {
			return head;
		}
		Node rest = reverse2(head.next);
		head.next.next = head;
		head.next=null;
		return rest;
	}
	
	public static void main(String[] args) {
		SinglyLinkedList l = new SinglyLinkedList();
		l.insertLast(1);
		l.insertLast(2);
		l.insertLast(3);
		l.insertLast(4);
		l.head = reverse(l.head);
		l.display();
		
	}

}
