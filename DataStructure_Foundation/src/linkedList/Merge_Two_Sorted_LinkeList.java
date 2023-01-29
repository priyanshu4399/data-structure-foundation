package linkedList;

import linkedList.SinglyLinkedList.Node;

public class Merge_Two_Sorted_LinkeList {

	public static void main(String[] args) {
		SinglyLinkedList l1 = new SinglyLinkedList();
		l1.insertLast(1);
		l1.insertLast(3);
		l1.insertLast(5);
		l1.insertLast(7);
		l1.display();
		SinglyLinkedList l2 = new SinglyLinkedList();
		l2.insertLast(2);
		l2.insertLast(4);
		l2.insertLast(6);
		l2.insertLast(8);
		l2.display();
		SinglyLinkedList l3 = new SinglyLinkedList();
	    l3.head = mergeTwoSinglyLinkedList(l1.head, l2.head);
		l3.display();
	}

	public static Node mergeTwoSinglyLinkedList(Node a, Node b) {
		Node dummy = new Node(0);
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
		return dummy.next;
	}

	

}
