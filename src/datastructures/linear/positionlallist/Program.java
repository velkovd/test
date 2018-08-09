package datastructures.linear.positionlallist;

import datastructures.linear.positionlallist.sorting.AccessOrderedList;

public class Program {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		LinkedPositionalList<Integer> pl = new  LinkedPositionalList<>();
//		
//		Position<Integer> p1 = pl.addFirst(1);
//		
//		pl.addAfter(p1, 2);
//		
//		LinkedList<Integer> ll = new LinkedList<>();
//		
		
		AccessOrderedList<Integer> favourites = new AccessOrderedList<>();
		favourites.add(1);
		favourites.add(2);
		favourites.add(3);
		favourites.add(4);
		favourites.add(5);
		favourites.printStatus();
		System.out.println("--------------------");
		favourites.get(4);
		favourites.get(4);
		favourites.get(1);
		favourites.printStatus();
		//favourites.get(4);
		//favourites.printStatus();

	}
}
