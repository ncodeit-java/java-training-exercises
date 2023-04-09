package com.ncodeit.collection;

import java.util.LinkedList;

public class TestLinkedList {

	public static void main(String[] args) {

	    LinkedList<String> list= new LinkedList<String>();
	    
	    System.out.println("Size at the beginning "+list.size());
	    
	    list.add("hcl");
	    list.add("tcs");
	    list.add("infosys");
	    list.addFirst("cognizant");
	    list.addLast("wipro");
	    
	    list.add(2,"ibm");
	    
	    System.out.println("Original Linked List " + list);
	    
	    System.out.println("Size after addition "+list.size());
	    
	    //remove element at index 5 
	    list.remove(5);
	    list.remove("ibm");
	    
	    System.out.println("New Linked List "+ list);
	    
	    System.out.println("Size after removal "+list.size());
		
	}

}
