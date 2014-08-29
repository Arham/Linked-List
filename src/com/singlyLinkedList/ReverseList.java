package com.singlyLinkedList;

/**
 * Created by apugalia on 8/29/2014.
 */
public class ReverseList {

	public static void main(String[] args) {
		Node n = Utils.createNodes(10);
		System.out.println("Original List");
		Utils.displayNodes(n);
		n = reverseList(n);
		System.out.println("Reversed List");
		Utils.displayNodes(n);
		n = recursiveReverseList(n);
		System.out.println("Recursively Reversed List");
		Utils.displayNodes(n);
	}

	private static Node reverseList(Node n) { // time complexity - O(n)
		if (n == null || n.next == null)
			return n;
		Node currentNode = n;
		Node previousNode = null;
		Node reverseHeadNode = null;
		while (currentNode != null) {
			Node nextNode = currentNode.next;
			if (nextNode == null)
				reverseHeadNode = currentNode;
			currentNode.next = previousNode;
			previousNode = currentNode;
			currentNode = nextNode;
		}
		return reverseHeadNode;
	}

	private static Node recursiveReverseList(Node n) { // time complexity - O(n)
		Node temp = null;
		Node first;
		Node rest;
		if (n == null || n.next == null)
			return n;
		first = n;
		rest = first.next;
		temp = recursiveReverseList(rest);
		first.next.next = first;
		first.next = null;
		return temp;
	}


}
