package eg.edu.alexu.csd.datastructure.queue;

import org.junit.Test;
import static org.junit.Assert.*;

public class kk
{

/*
 *   Test case number: 1
 *   Test case values: push 1 and 2 into the queue
 *   Expected output (Post-state): [1, 2]
 */
	@Test
	public void test1()
	{
		QueueL q = new QueueL();
		q.enqueue(1);
		q.enqueue(2);
		//Object i = q.dequeue();
		assertEquals(1,q.dequeue());
	}

/*
 *   Test case number: 2
 *   Test case values: push 1 and 2 into the queue, then pop the first item
 *   Expected output (Post-state): [2]
 */
	@Test
		public void test2()
	{
		QueueL q = new QueueL();
		q.enqueue(1);
		q.enqueue(2);
		Object i = q.dequeue();
		assertEquals(1,i);
		
	}
	

	@Test
		public void test3()
	{
		QueueL q = new QueueL();
		q.enqueue(1);
		assertEquals(false, q.isFull());	
	}
	
/*
 *   Test case number: 6
 *   Test case values: push 1 into a queue with 2 spaces, check if the queue is empty
 *   Expected output (Post-state): return false, the queue is not empty
 */	
	@Test
			public void test6()
	{
		QueueL q = new QueueL();
		q.enqueue(1);
		assertEquals(false, q.isEmpty());	
	}

	
/*
 *   Test case number: 7
 *   Test case values: initialize a new queue, check if the queue is empty
 *   Expected output (Post-state): return true, the queue is empty
 */	
	@Test
				public void test7()
	{
		Queue q = new Queue(0);
		assertEquals(true, q.isEmpty());	
	}
	
/*
 *   Test case number: 8
 *   Test case values: push 1 and 2into a queue with 2 spaces, check if the queue is full
 *   Expected output (Post-state): return true, the queue is full
 */		
	@Test
	public void test8() {
		QueueL q = new QueueL();
		q.enqueue(1);
		q.enqueue(2);
		assertEquals(true, q.isFull());
	}
	/*
	 *   Test case number: 9
	 *   Test case values: push 1 and 2into a queue with 2 spaces, check if the queue is full
	 *   Expected output (Post-state): return true, the queue is full
	 */		
	@Test
	public void test5() {
		QueueL q = new QueueL();
		q.enqueue(1);
		q.enqueue(2);
		q.dequeue();
		q.enqueue(3);
		assertEquals(2 ,(int)q.dequeue());
	}
/*
 *   Test case number: 11
 *   Test case values: initialize a new queue with 2 spaces, pop 3 times
 *   Expected output (Post-state): throw IllegalStateException
 */	
	@Test(expected=IllegalStateException.class)
	public void test4()
	{
		QueueL q = new QueueL();
		q.enqueue(1);
		q.enqueue(2);
		q.dequeue();
		q.dequeue();q.dequeue();
		assertEquals(true, q.isEmpty());
	}
}
