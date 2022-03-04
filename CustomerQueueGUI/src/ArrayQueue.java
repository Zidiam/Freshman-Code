
public class ArrayQueue<T> implements QueueADT<T>{

	private static int DEFAULTSIZE = 50;
	private T[] buffer;
	private int maxSize;
	private int size;
	private int head;
	private int tail;
	
	public ArrayQueue() {
		buffer = (T []) new Object[DEFAULTSIZE];
		maxSize = DEFAULTSIZE;
		size = 0;
		head = 0;
		tail = 0;
	}
	
	public int get(T element) {
		for(int x = 0; x < size; x++) {
			if(element == buffer[x])
				return x;
		}
		return -1;
	}
	
	public T get(int location) {
		if(head == 0)
			return buffer[location];
		else
			return buffer[head + location];
	}
	
	@Override
	public void enqueue(T element) {
		if(size == maxSize) {
			resize();
		}
		buffer[tail] = element;
		tail = (tail + 1) % maxSize;
		size += 1;	
	}
	
	public void resize() {
		T[] biggerBuffer = (T []) new Object[maxSize*2];
		for(int i = 0; i < maxSize; i++) {
			biggerBuffer[i] = buffer[head];
			head = (head + 1) % maxSize;
		}
		size = maxSize;
		maxSize = 2*maxSize;
		head = 0;
		tail = size;
		buffer = biggerBuffer;
	}

	@Override
	public T dequeue() {
		if(isEmpty())
			throw new EmptyCollectionException("ArrayQueue empty");
		else {
			T val = buffer[head];
			head = (head + 1) % maxSize;
			size -= 1;
			return val;
		}
	}

	@Override
	public T first() {
		if(isEmpty())
			throw new EmptyCollectionException("ArrayQueue empty");
		else
			return buffer[head];
	}

	@Override
	public boolean isEmpty() {
		return size == 0;
	}

	@Override
	public int size() {
		return size;
	}
	

}
