package datastructures.tree;

import java.util.ArrayList;
import java.util.List;

public class Node<T> {
	private Node<T> parrent;
	private List<Node<T>> children;
	private T val;

	public Node(Node<T> parrent, T val) {
		this.val = val;
		this.children = new ArrayList<Node<T>>();
	}

	public void setVal(T val) {
		this.val = val;
	}

	T getVal() {
		return this.val;
	}

	public Node<T> getParrent() {
		return parrent;
	}

	public void setParrent(Node<T> parrent) {
		this.parrent = parrent;
	}

	public void setChildren(List<Node<T>> children) {
		this.children = children;
	}

	List<Node<T>> getChildren() {
		return this.children;
	}
}
