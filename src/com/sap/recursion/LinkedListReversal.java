package com.sap.recursion;

public class LinkedListReversal {

	static class Node {
		public int val;
		private Node next;

		public Node(int val) {
			this.val = val;
		}

		public Node getNext() {
			return next;
		}

		public void setNext(Node next) {
			this.next = next;
		}

	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Node n1 = new Node(1);
		Node n2 = new Node(2);
		Node n3 = new Node(3);
		Node n7 = new Node(4);

		n1.setNext(n2);
		n2.setNext(n3);
		n3.setNext(n7);

		printList(n1);

	}

	private static void printList(Node n1) {
		
		Node head = n1;
		while(head!=null) {
		  System.out.println(head.val );
		  head= head.getNext();
		  System.out.println(" ");
		}

	}

}
