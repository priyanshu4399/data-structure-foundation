package linkedList;

import linkedList.SinglyLinkedList.Node;

public class Remove_Duplicate_From_Sorted_SinglyLinkList {
    
	public static void removeDuplicateFromSortedList(Node head) {
		Node cur=head;
	
		while(cur!=null && cur.next!=null) {
			if(cur.data==cur.next.data)  
				cur.next=cur.next.next;
			else 
				cur=cur.next;

		}
	}
	public static Node removeDuplicateFromSortedList2(Node head) {
		if(head==null)
			return null;
		if(head.next!=null) {
			if(head.data==head.next.data) {
				head.next=head.next.next;
				removeDuplicateFromSortedList2(head.next);
			}
			else
				removeDuplicateFromSortedList2(head.next);
				
		}
		return head;
	}
	public static void main(String[] args) {
			SinglyLinkedList list = new SinglyLinkedList();
			list.insertLast(1);
			list.insertLast(1);
			list.insertLast(2);
			list.insertLast(3);
			list.insertLast(3);
			list.insertLast(4);
			removeDuplicateFromSortedList(list.head);
			list.display();
	} 


}
