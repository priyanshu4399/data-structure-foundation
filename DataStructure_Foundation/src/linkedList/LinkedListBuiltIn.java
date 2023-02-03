package linkedList;

import java.util.LinkedList;

public class LinkedListBuiltIn {

	public static void main(String[] args) {
				LinkedList<String> list = new LinkedList<>();
				
				//append element to the end of the list
				list.add("apple");
				list.add("apple");
				list.add("guava");
			
				//add element at first position
				list.addFirst("mango");
				
				//add element at last position
				list.addLast("banana");
				
				//add element at specific index
				list.add(1, "orange");
				
				//Printing LinkedList
				System.out.println(list);
				
				
				//Returns true if this list contains the specified element. 
				list.contains("apple");
				
				//Returns the index of the first occurrence of the specified element in this list, or -1 if this list does not contain the element.
				System.out.println("first index of index of 'apple' : "+list.indexOf("apple"));
				
				//Returns the index of the last occurrence of the specified element in this list, or -1 if this list does not contain the element
				System.out.println("last index of index of 'apple' : "+list.lastIndexOf("apple"));
				
				
				//Returns the element at the specified position in this list
				System.out.println("Element at 0th postion :"+list.get(0));
				
				//Retrieves and removes the head (first element) of this list.
				System.out.println("Removing first element :"+list.remove());
				
				//Removes the element at the specified position in this list
				System.out.println("Removing element at position 2 : "+list.remove(2));
				
				//Removes the element at the specified position in this list
				System.out.println("Removing 'orange' from the list: "+list.remove("orange"));
				
				//Retrieves and removes the head (first element) of this list.
				System.out.println("Removing first element :"+list.removeFirst());
				
				//Removes and returns the last element from this list
				System.out.println("Removing last element :"+list.removeLast());
				System.out.println(list);
				
				//check is list is empty
				System.out.println("Is List is empty :" +list.isEmpty());
				
				//Returns the number of elements in this list
				System.out.println("The number of elements in this list : " + list.size());
				
				
				
				
				
				
				
				
				
				
				
	}

}
