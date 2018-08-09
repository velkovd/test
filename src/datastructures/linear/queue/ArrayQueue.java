package datastructures.linear.queue;

import java.lang.reflect.Array;

public class ArrayQueue<T>{
	private T[] storage;
	private int front = 0;
	private int tail = 0;
	private int total = 0;
	private int size = 10;
	
	
	@SuppressWarnings("unchecked")
	public ArrayQueue(Class<T> clazz ) {
		this.storage = (T[]) (Array.newInstance(clazz, size));
	}
	
	public void status() {
		for (int i = 0; i < storage.length; i++) {
			System.out.print(i + " ");
			System.out.println(storage[i]);
		}
		
		
	}
	//1,
	public T dequeue() {
		total--;
		front = getNext(front);
		T t = storage[front];
		storage[front] = null;
		
		return t;
	}
	
	public void enqueue(T element) {
		total++;
		tail = getNext(tail);
		storage[getNext(tail)] = element;
	}
	
	public T first() {
		return storage[front];

	}
	
	public int size() {
		return total;
	}
	
	private int getNext(int base) {
		if(base+1 > size-1) {
			base = 0;
			return base;
		}else {
			return ++base; 
		}
	}
}
