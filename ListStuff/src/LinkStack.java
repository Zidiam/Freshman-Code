class StackNode<T>{
	T item;
	StackNode<T> rest;
	
	public StackNode(T item) {
		this(item, null);
	}
	
	public StackNode(T item, StackNode rest) {
		this.item = item;
		this.rest = rest;
	}
}
public class LinkStack<T> implements StackADT<T>{
	
	private StackNode<T> stack;
	private int size;
	
	public LinkStack(){
		stack = null;
		size = 0;
	}
	
	public void push(T element) {
		size += 1;
		stack = new StackNode<T>(element, stack);
	}

	@Override
	public T pop() {
		if (size == 0)
			System.out.println("break");
		T value = stack.item;
		stack = stack.rest;
		return value;
		
	}

	@Override
	public T peak() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public boolean isEmpty() {
		return size == 0;
	}

	@Override
	public int size() {
		// TODO Auto-generated method stub
		return size;
	}

}
