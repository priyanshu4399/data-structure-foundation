package linkedList;

import linkedList.SinglyLinkedList.Node;

public class Nth_Node_From_End {
    
	private static Node getNthNodeFromEnd(Node head,int n) {
		Node temp = head;
		int len=0;
		while(temp!=null) {
			temp=temp.next;
			len++;
		}
		if(n<1 || n>len)
			return null;
		temp = head;
		for(int i=1;i<=len-n;i++) {
			temp = temp.next;
		}
		return temp;
	}
	
	private static Node getNthNodeFromEnd2(Node head,int n) {
		if(head==null) {
			System.out.println("List is Empty");
			return null;
		}
		if(n<1) {
			System.out.println("Invalid value : n");
			return null;
		}
	
		Node main = head;
		Node ref = head;
		for(int i=1;i<=n;i++) {
			if(ref==null) {
				System.out.println("n is greater then no of element in List");
				return null;
			}
			ref = ref.next;
		}
	
		while(ref!=null) {
			ref = ref.next;
			main = main.next;
		}
		return main;
	}
	
	public static void main(String[] args) {
			SinglyLinkedList l = new SinglyLinkedList();
			l.insertLast(1);
			l.insertLast(2);
			l.insertLast(3);
			l.insertLast(4);
			Node node = getNthNodeFromEnd2(l.head,5);
			if(node!=null)
				System.out.println(node.data);
			else
				System.out.println("No node is return");
			
			
			
		
	}


}
