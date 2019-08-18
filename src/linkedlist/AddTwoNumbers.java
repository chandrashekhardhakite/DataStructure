package linkedlist;

import java.util.LinkedList;

public class AddTwoNumbers {

	ListNode head;

	public static void main(String[] args) {
		System.out.println("MainMethod");
		LinkedList<Integer> l1 = new LinkedList<Integer>();
		l1.add(2);
		l1.add(4);
		l1.add(3);
		LinkedList<Integer> l2 = new LinkedList<Integer>();
		l2.add(5);
		l2.add(6);
		l2.add(4);
//		addTwoNumbers(l1, l2);

		AddTwoNumbers addTwoNumber = new AddTwoNumbers();
		addTwoNumber.appendNode(2);
		addTwoNumber.appendNode(4);
		addTwoNumber.appendNode(3);
		addTwoNumber.printLinkedList();

	}

	public void printLinkedList() {

		if (head == null)
			return;

		ListNode tempNode = head;
		while (tempNode != null) {
			System.out.println("--> " + tempNode.data);
			tempNode = tempNode.next;
		}
	}

	private void appendNode(int data) {
		if (head == null) {
			head = new ListNode(data);
			return;
		}
		ListNode temp = head;
		while (temp.next != null) {
			temp = temp.next;
		}
		temp.next = new ListNode(data);
	}

	private static void addTwoNumbers(LinkedList<Integer> l1, LinkedList<Integer> l2) {

		LinkedList<Integer> l3 = new LinkedList<Integer>();
		StringBuilder str1 = new StringBuilder();
		for (Integer integer : l1) {
			str1.append(integer);
		}
		str1.reverse();
		System.out.println(str1);
		StringBuilder str2 = new StringBuilder();
		for (Integer integer : l2) {
			str2.append(integer);
		}
		str2.reverse();
		System.out.println(str2);

		int num1, num2, addition;
		num1 = Integer.parseInt(str1.toString());
		num2 = Integer.parseInt(str2.toString());
		addition = num1 + num2;
		System.out.println("Addition " + addition);
		String str = Integer.toString(addition);
		StringBuilder s3 = new StringBuilder();
		s3.append(str);
		s3.reverse();
		System.out.println("Reverse s3 " + s3);

		for (int i = 0; i < s3.length(); i++) {
			char ch = s3.charAt(i);
			String m = Character.toString(ch);
			l3.add(Integer.parseInt(m));
		}
		

		System.out.println(l3);

	}
	
	/**
	 * Definition for singly-linked list.
	 * public class ListNode {
	 *     int val;
	 *     ListNode next;
	 *     ListNode(int x) { val = x; }
	 * }
	 */
	class Solution {
	    
	    ListNode head;
	    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
	        
	        String str1 ="" ,str2 ="";
	        StringBuilder  sb1 = new StringBuilder();
	        StringBuilder  sb2 = new StringBuilder();
	        Long num1 , num2, addition;
	        if(l1 != null){
	            ListNode tempNode =l1;
	            while(tempNode!= null){
	                 str1 += Long.toString(tempNode.data);
	                // System.out.println(str1);
	                tempNode = tempNode.next;
	            }
	           
			    sb1.append(str1);
	            sb1.reverse();
	        }
	        num1 =Long.parseLong(sb1.toString());
	        System.out.println(num1);
	        
	        if(l2 != null){
	            ListNode tempNode =l2;
	            while(tempNode != null){
	                // System.out.println(tempNode.val);
	                str2 += Long.toString(tempNode.data);
	                // System.out.println(str2);
	                tempNode = tempNode.next;
	            }
	            sb2.append(str2);
	            sb2.reverse();
	        }
	          num2 =Long.parseLong(sb2.toString());
	        System.out.println(num2);
	         addition = num1+num2;
	        
	        while (addition > 0) {
	            // int i = (addition % 10)
	            appendNode((int)(addition % 10));
	            System.out.println(addition % 10);            
	            addition = addition / 10;
	        }
	        
	        
	        
	        
	        return head;
	    } 
	    
	    public void appendNode(int val){
	        if(head == null){
	             head = new ListNode(val);
	            return;
	        }
	        ListNode tempNode = head;
	          while(tempNode.next != null){
	              tempNode = tempNode.next;
	          }
	        tempNode.next = new ListNode(val);
	    }
	    
	}

	public class ListNode {
		int data;
		ListNode next;

		public ListNode(int data) {
			this.data = data;
			this.next = null;
		}

	}

}
