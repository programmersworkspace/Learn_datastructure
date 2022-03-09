package singlylinkedlist;

import java.util.Scanner;

public class SinglyLinkedList {

	private ListNode head;

	private static class ListNode {
		private int data;
		private ListNode nextNode;

		public ListNode(int data) {
			this.data = data;
			this.nextNode = null;
		}
	}

	public static void main(String[] args) {
		SinglyLinkedList sll = new SinglyLinkedList();
		sll.head = new ListNode(10);
		ListNode second = new ListNode(1);
		ListNode third = new ListNode(5);
		ListNode Four = new ListNode(7);
		ListNode five = new ListNode(4);
		sll.head.nextNode = second;
		second.nextNode = third;
		third.nextNode = Four;
		Four.nextNode = five;
		System.out.println("Printing Linkedlist data...");
		sll.display();
		sll.count();
		sll.addInsertData();
		System.out.println("Data after adding node");
		sll.display();
		sll.count();
	}

	public void addInsertData() {
		System.out.print("Enter the data for node : ");
		Scanner sc = new Scanner(System.in);
		int data = sc.nextInt();
		ListNode newNode = new ListNode(data);
		System.out.println("		case 1: // insert first\r\n"
				+ "		case 2: // insert last\r\n"
				+ "		case 3: // insert at position\r\n"
				+ "		case 4: // delete node at start\r\n"
				+ "		");
		System.out.println("Enter select the following option");

		int option = sc.nextInt();
		switch (option) {
		case 1: // insert first
			insertFirst(newNode);
			break;
		case 2: // insert last
			insertLast(newNode);
			break;
		case 3: // insert at position
			System.out.print("Enter the position for node : ");
			int position = sc.nextInt();
			insertNodeAtPosition(position, newNode);
			break;
		case 4: // delete node at start
			break;
		case 5: // delete node at end
			break;
		default:
			break;
		}
	}

	public void insertNodeAtPosition(int position, ListNode newNode) {
		if (head == null) {
			head = newNode;
		}
		ListNode current = head;
		while (current.nextNode != null) {
			current = current.nextNode;
		}
		current.nextNode = newNode;

	}

	public void insertLast(ListNode newNode) {
		if (head == null) {
			head = newNode;
		}
		ListNode current = head;
		while (current.nextNode != null) {
			current = current.nextNode;
		}
		current.nextNode = newNode;
	}

	public void insertFirst(ListNode newNode) {
		newNode.nextNode = head;
		head = newNode;
	}

	public void display() {
		ListNode current = head;
		while (current != null) {
			System.out.print(current.data + "-->");
			current = current.nextNode;
		}
		System.out.println("null");
	}

	public void count() {
		int count = 0;
		ListNode current = head;
		while (current != null) {
			count++;
			current = current.nextNode;
		}
		System.out.println("LinkedList Length :" + count);
	}

}
