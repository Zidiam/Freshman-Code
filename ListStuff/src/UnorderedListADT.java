
public interface UnorderedListADT<T> extends ListADT<T> {
	public void addFirst(T element);
	public void addLast(T element);
	public void addAfter(T element, T preceder);
	
}
