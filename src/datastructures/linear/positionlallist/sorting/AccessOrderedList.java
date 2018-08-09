package datastructures.linear.positionlallist.sorting;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class AccessOrderedList<T> {
	// public add();

	// 4,3,3
	private List<Item> storage;

	public AccessOrderedList() {
		storage = new ArrayList<>();
	}

	public T get(int index) {
		Item item = storage.get(index);
		T val = item.getVal();
		reorder(index);
		
		return val;

	}

	public void add(T val) {
		storage.add(new Item(val));
	}

	public void printStatus() {
		for (Item i : storage) {

			System.out.println(i);
		}
	}

	private class Item {
		private int count;
		private T val;

		public Item(T val) {
			this.val = val;
			this.count = 0;
		}

		public int getCount() {
			return count;
		}

		public T getVal() {

			this.count++;
			return val;
		}

		@Override
		public String toString() {
			return "Access:" + count + ", Val:" + val;
		}
	}

	private void reorder(int index) {
		Item updatedItem = storage.get(index);
		for (int i = index; i >= 0; i--) {
			if (i > 0 && storage.get(i - 1).getCount() < updatedItem.getCount()) {
				storage.set(i, storage.get(i - 1));
				storage.set(i - 1, updatedItem);

			} else {
				break;
			}
		}
	}
}
