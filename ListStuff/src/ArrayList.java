import java.util.ConcurrentModificationException;
import java.util.Iterator;


public abstract class ArrayList<T> implements ListADT<T>, Iterable<T>{
	private final static int DEFAULT_CAPACITY = 100;
	private final static int NOT_FOUND = -1;
	protected int rear;
	protected T[] list;
	protected int modCount;
	
	public ArrayList() {
		this(DEFAULT_CAPACITY);
	}
	
	public ArrayList(int capacity) {
		rear = 0;
		list = (T []) new Object[capacity];
		modCount = 0;
	}
	

	public Iterator<T> iterator() {
		return new ArrayListIterator();
	}
	
	public void add(T element) {
		if(!(element instanceof Comparable))
			throw new NonComparableElementException("Unordered List");
		
		Comparable<T> comparableElement = (Comparable<T>) element;
		
		if(size() == list.length)
			expandCapacity();
		
		int scan = 0;
		
		while(scan < rear && comparableElement.compareTo(list[scan]) > 0)
			scan ++;
		
		for(int shift = rear; shift > scan; shift --) {
			list[shift] = list[shift - 1];
		}
		
		list[scan] = element;
		rear ++;
		modCount++;
		
	}

	protected void expandCapacity() {
		T[] temp =  (T []) new Object[size() * 2];
		for(int x = 0; x < temp.length; x++){
			if(x < list.length)
				temp[x] = list[x];
		}
		list = temp;
		
	}

	public boolean hasNext() {
		// TODO Auto-generated method stub
		return false;
	}


	public T next() {
		// TODO Auto-generated method stub
		return null;
	}


	public T removeFirst() {
		// TODO Auto-generated method stub
		return null;
	}


	public T removeLast() {
		// TODO Auto-generated method stub
		return null;
	}


	public T remove(T element) {
		T result;
		int index = find(element);
		if(index == NOT_FOUND) {
			throw new ElementNotFoundException("ArrayList");
		}
		
		result = list[index];
		rear--;
		
		for(int scan = index; scan < rear; scan++)
			list[scan] = list[scan + 1];
		
		list[rear] = null;
		modCount ++;
		return result;
	}
	
	private int find(T element) {
		int scan = 0;
		int result = NOT_FOUND;
		if(!isEmpty()) {
			while(result == NOT_FOUND && scan < rear) {
				if(element.equals(list[scan]))
					result = scan;
				else
					scan ++;
			}
		}
		return result;
	}


	public T first() {
		if(isEmpty())
			throw new ElementNotFoundException("t");
		return list[0];
	}


	public T last() {
		if(isEmpty())
			throw new ElementNotFoundException("t");
		return list[rear -1];
	}


	public boolean contains(T element) {
		return find(element) != NOT_FOUND;
	}


	public boolean isEmpty() {
		return rear == 0;
	}


	public int size() {
		return rear;
	}


	private class ArrayListIterator implements Iterator<T> {
		int itModCount;
		int currentDex;
		
		public ArrayListIterator() {
			itModCount = modCount;
			currentDex = 0;
		}
		
		public boolean hasNext() {
			if(itModCount != modCount)
					throw new ConcurrentModificationException();
			return currentDex < rear;
		}
		
		public T next() {
			if(itModCount != modCount)
				throw new ConcurrentModificationException();
			currentDex ++;
			return (T) list[currentDex - 1];
		}
		
		public void remove() {
			throw new UnsupportedOperationException();
		}
	}
}
