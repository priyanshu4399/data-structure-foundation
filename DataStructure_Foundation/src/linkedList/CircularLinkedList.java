package linkedList;

public class CircularLinkedList {
	Node head;
	
	static class Node{
		int data;
		Node next;
		Node(int d){
			data = d;
		}
	}
	
	Node insertBeg(Node head, int data) {
		Node temp = new Node(data);
		if(head==null) {
			temp.next=temp;
			return temp;
	    }
		Node cur = head;
		while(cur.next!=head)
			cur=cur.next;
		cur.next=temp;
		temp.next=head;
		return temp;
	}
	
	Node insertBeg2(Node head, int data) {
		Node temp = new Node(data);
		if(head==null) {
			temp.next=temp;
			return temp;
	    }
		temp.next=head.next;
		head.next=temp;
		int t=head.data;
		head.data=temp.data;
		temp.data = t;
		return head;
			
	}
	
	Node insertEnd(Node head, int data) {
		Node temp = new Node(data);
		if(head==null) {
			temp.next=temp;
			return temp;
	    }
		Node cur = head;
		while(cur.next!=head)
			cur=cur.next;
		cur.next=temp;
		temp.next=head;
		return head;
	}
	
	Node insertEnd2(Node head, int data) {
		Node temp = new Node(data);
		if(head==null) {
			temp.next=temp;
			return temp;
	    }
		temp.next=head.next;
		head.next=temp;
		int t=head.data;
		head.data=temp.data;
		temp.data = t;
		return temp;
	}
	
	Node deleteHead(Node head) {
		if(head==null || head.next==null) return null;
		head.data = head.next.data;
		head.next=head.next.next;
		return head;
	}
	
	Node deleteKthNode(Node head,int k) {
		if(head==null || head.next==null) return null;
		if(k==1) return deleteHead(head);
		
		Node cur =head;
		for(int i=1;i<=k-2;i++) {
			cur=cur.next;
		}
		cur.next=cur.next.next;
		return head;
	}
	
	void display() {
		if(head==null) return;
		System.out.print(head.data+"->");
		for(Node cur=head.next;cur!=head;cur=cur.next)
			System.out.print(cur.data+"->");
		System.out.println("null");
	}
	public static void main(String[] args) {
		CircularLinkedList cll = new CircularLinkedList();
		cll.head = cll.insertBeg(cll.head,30);
		cll.head = cll.insertBeg(cll.head,20);
		cll.head = cll.insertBeg(cll.head,10);
		cll.display();
		cll.head = cll.insertEnd2(cll.head,40);
		cll.head = cll.insertEnd2(cll.head,50);
		cll.head = cll.insertEnd2(cll.head,60);
		cll.display();
		cll.head = cll.deleteHead(cll.head);
		cll.display();
		cll.head = cll.deleteKthNode(cll.head,2);
		cll.display();
	}

}
