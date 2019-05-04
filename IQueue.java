package eg.edu.alexu.csd.datastructure.queue;
/**
 * 
 * @author Essam and abdelaziz .
 *
 */
public interface IQueue {
	/**
	* Inserts an item at the queue front.
	*/
	public void enqueue(Object item);
	/**
	* Removes the object at the queue rear 
	* @return Object .
	*/
	public Object dequeue();
	/**
	* Tests if this queue is empty.
	* @return Boolean .
	*/
	public boolean isEmpty();
	/**
	* @return the number of elements in the queue
	*/
	public int size();
}
