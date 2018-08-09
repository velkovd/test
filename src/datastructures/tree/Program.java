package datastructures.tree;

import java.security.cert.PolicyQualifierInfo;
import java.util.Arrays;
import java.util.LinkedList;
import java.util.Queue;

public class Program {

	public static void main(String[] args) {
		Node<String> root = new Node<>(null, "book");
		Node<String> l1 = new Node<>(root, "1.1");
		Node<String> l1_1 = new Node<>(root, "1.2");
		Node<String> l1_2 = new Node<>(root, "1.3");

		root.setChildren(Arrays.asList(l1, l1_1, l1_2));

		Node<String> l2 = new Node<>(l1, "1.1.1");
		Node<String> l2_1 = new Node<>(l1, "1.1.2");
		l1.setChildren(Arrays.asList(l2, l2_1));

		Node<String> l3 = new Node<>(l2, "1.1.1.1");
		Node<String> l3_1 = new Node<>(l2, "1.1.1.2");

		l2.setChildren(Arrays.asList(l3, l3_1));
		
		Node<String> l3_2 = new Node<>(l2_1, "1.1.2.1");
		Node<String> l3_3 = new Node<>(l2_1, "1.1.2.2");

		l2_1.setChildren(Arrays.asList(l3_2, l3_3));
		DFS(root, 0);
		System.out.println("===================");
		q.add(root);
		printBFS(q);
	}


	private static void DFS(Node<String> node, int indent) {
		log(node.getVal(), indent);
		for (int i = 0; i < node.getChildren().size(); i++) {
			DFS(node.getChildren().get(i), indent + 1);
		}
	}

	private static Queue<Node<String>> q = new LinkedList<>();
	
	private static void printBFS(Queue<Node<String>> q) {
		Node<String> p = q.peek();
		if(p != null) {
			q.poll();
			System.out.println(p.getVal());
			for (int i = 0; i < p.getChildren().size(); i++) {
				q.add(p.getChildren().get(i));
			}
			printBFS(q);
		}
		
		
	}

	private static void log(String val, int spaces) {
		String space = "";
		for (int i = 0; i < spaces; i++) {
			space += "  ";
		}
		System.out.println(space + val);
	}
}
