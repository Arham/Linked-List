package com.singlyLinkedList;

/**
 * Created by apugalia on 8/29/2014.
 */
public class Utils {
	public static void displayNodes(Node root) {
		while (root != null) {
			System.out.print(root.data + "->");
			root = root.next;
		}
		System.out.print("null");
		System.out.println();
	}

	public static Node createNodes(int numOfNodes) {
		Node root = new Node();
		root.data = 0;
		Node current = root;
		for (int i = 1; i < numOfNodes; i++) {
			Node temp = new Node();
			temp.data = i;
			current.next = temp;
			current = temp;
		}
		return root;
	}
}
