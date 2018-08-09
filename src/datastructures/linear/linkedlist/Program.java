package datastructures.linear.linkedlist;

public class Program {

	public static void main(String[] args) {
		SinglyLinkedList<Integer> list = new SinglyLinkedList<>();
		System.out.println(list.isEmpty());
		list.addFirst(0);
		System.out.println(list.size());
		list.addFirst(-1);
		System.out.println(list.size());
		list.addFirst(-2);
		System.out.println(list.size());
		list.addLast(1);
		System.out.println(list.size());
		list.addLast(2);
		System.out.println(list.size());
		list.addLast(-3);
		System.out.println(list.size());
		System.out.println("-------------");
			
		System.out.println(list.first());
		System.out.println(list.last());
		System.out.println("-------------");
		list.removeFirst();
		System.out.println(list.first());
		list.removeFirst();
		System.out.println(list.first());
		list.removeFirst();
		System.out.println(list.first());
		list.removeFirst();
		System.out.println(list.first());
		list.removeFirst();
		System.out.println(list.first());
		list.removeFirst();
		System.out.println(list.first());
		list.removeFirst();
		System.out.println(list.first());
		list.removeFirst();
		System.out.println(list.first());
		list.removeFirst();
		System.out.println(list.first());
			
	}

}
