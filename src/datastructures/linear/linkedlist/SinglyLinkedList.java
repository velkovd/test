package datastructures.linear.linkedlist;

public class SinglyLinkedList<T> {
	private Node head;
	private Node tail;
	private int size;

	public int size() {
		return this.size;
	}

	public boolean isEmpty() {
		return size == 0;
	}

	public T first() {
		return this.head != null ? this.head.getValue() : null;
	}

	public T last() {
		return this.tail != null ? this.tail.getValue() : null;
	}

	public void addFirst(T value) {
		if (this.head == null) {
			this.head = new Node(value, null);
			this.tail = head;
		} else {
			Node newHead = new Node(value, null);
			newHead.next = this.head;
			this.head = newHead;
		}

		this.size++;
	}

	public void addLast(T value) {
		if (this.head == null) {
			this.head = new Node(value, null);
			this.tail = head;
		} else {
			Node newTail = new Node(value, null);
			this.tail.setNext(newTail);
			this.tail = newTail;
		}

		this.size++;
	}

	public boolean removeFirst() {
		if (this.head == null) {
			return false;
		}

		if (this.head.getNext() == null) {
			this.head = null;
			this.tail = null;
		} else {
			this.head = this.head.getNext();
		}

		return true;
	}

	private class Node {
		private T value;
		private Node next;

		public Node(T value, Node next) {
			this.setValue(value);
			this.setNext(next);
		}

		public Node getNext() {
			return next;
		}

		public void setNext(Node next) {
			this.next = next;
		}

		public T getValue() {
			return value;
		}

		public void setValue(T value) {
			this.value = value;
		}
	}
}
