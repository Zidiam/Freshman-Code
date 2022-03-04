/*
 * 
 */
public interface QueueADT<T> {
	/*
	 * Adds the specified element to the end of the queue
	 * @param element element to be added
	 */
	public void enqueue(T element);
	/*
	 * Removes and returns the first element from this queue
	 * @return the element removed from the queue
	 */
	public T dequeue();
	/*
	 * Returns without removing the element of the queue
	 * @param the element at the front of the queue
	 */
	public T first();
	public boolean isEmpty();
	public int size();
	public String toString();
	
}
