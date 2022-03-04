class QNode<T>{
	T item;
	QNode<T> rest;
	
	public QNode(T item) {
		this.item = item;
		this.rest = null;
	}
	
}
public class LinkQueue<T> implements QueueADT<T> {
	QNode<T> head;//first node
	QNode<T> tail;//last node
	int size;//size
	
	public LinkQueue() {
		head = null;
		tail = null;
		size = 0;
	}
	
	@Override
	public void enqueue(T element) {
		if(size == 0)
			head = tail = new QNode<T>(element);
		else {
			tail.rest = new QNode<T>(element);
			tail = tail.rest;
		}
		size += 1;
			
	}
	
	@Override
	public T dequeue() {
		if(size == 0)
			System.out.println("Error! Queue is empty");
		T value = head.item;
		head = head.rest;
		size --;
		if(head == null)
			tail = null;
		// TODO Auto-generated method stub
		return value;
	}

	@Override
	public T first() {
		if(size == 0)
			System.out.println("Error! Queue is empty");
		return head.item;
	}

	@Override
	public boolean isEmpty() {
		// TODO Auto-generated method stub
		return size == 0;
	}

	@Override
	public int size() {
		// TODO Auto-generated method stub
		return size;
	}

}
