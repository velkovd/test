package datastructures.linear.positionlallist;

public class ArrayPossitionalList<E> implements PositionalList<E> {
	private Node[] store;

	private class Node implements Position<E> {
		private E val;
		private int index;

		public Node(E val, int index) {
			this.val = val;
			this.index = index;
		}

		@Override
		public E getElement() throws IllegalStateException {
			// TODO Auto-generated method stub
			return val;
		}

		public void setVal(E val) {
			this.val = val;
		}

		public int getIndex() {
			return index;
		}
		
		public int shiftForward() {
			return ++index;
		}
		
		public int shiftBackward() {
			return --index;
		}
	}

	private int size = 0;

	@SuppressWarnings("unchecked")
	public ArrayPossitionalList() {
		store = (Node[]) new Object[100];
	}

	@Override
	public int size() {
		return size;
	}

	@Override
	public boolean isEmpty() {
		return size == 0;
	}

	@Override
	public Position<E> first() {
		return store[0];
	}

	@Override
	public Position<E> last() {
		return store[size - 1];
	}

	@Override
	public Position<E> before(Position<E> p) throws IllegalArgumentException {
		return store[((Node) p).getIndex() - 1];
	}

	@Override
	public Position<E> after(Position<E> p) throws IllegalArgumentException {
		return store[((Node) p).getIndex() + 1];
	}

	@Override
	public Position<E> addFirst(E e) {
		shiftForward(0);
		return insertNode(new Node(e, size));
	}

	@Override
	public Position<E> addLast(E e) {
		return insertNode(new Node(e, size));
	}

	@Override
	public Position<E> addBefore(Position<E> p, E e) throws IllegalArgumentException {
		Node n = (Node) p;
		int index = n.getIndex();
		shiftForward(index);
		
		return insertNode(new Node(e, index));
	}

	@Override
	public Position<E> addAfter(Position<E> p, E e) throws IllegalArgumentException {
		return addBefore(after(p), e);
	}

	@Override
	public E set(Position<E> p, E e) throws IllegalArgumentException {
		Node n = (Node) p;

		store[n.getIndex()].setVal(e);
		return e;
	}

	@Override
	public E remove(Position<E> p) throws IllegalArgumentException {
		Node n = (Node)p;
		
		shiftBackward(n.getIndex());
		size--;
		
		return n.getElement();
	}

	private void shiftForward(int startIndex) {
		for (int i = size - 1; i >= startIndex; i--) {
			int newInxed = ++i;
			store[newInxed] = store[i];
			store[newInxed].shiftForward();		
		}
	}
	
	private void shiftBackward(int endIndex) {
		for (int i = size - 1; i >= endIndex; i--) {
			int newInxed = --i;
			store[newInxed] = store[i];
			store[newInxed].shiftBackward();
		}
	}

	private Node insertNode(Node node) {
		store[node.getIndex()] = node;
		size++;
		return node;
	}

}
