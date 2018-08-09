package datastructures.linear.queue;

public class Program {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayQueue<Integer> q = new ArrayQueue<>(Integer.class);
		
		q.enqueue(1);
		q.enqueue(2);
		q.enqueue(3);
		q.enqueue(4);
		q.enqueue(5);
		q.enqueue(6);
		q.enqueue(7);
		q.enqueue(8);
		q.enqueue(9);
		q.status();
		q.dequeue();
		q.dequeue();
		q.status();
		q.enqueue(10);
		q.enqueue(11);
		q.status();
		System.out.println("-");
		q.dequeue();
		q.dequeue();
		q.status();
		
		
	}

}
