/**
 * Represents the situation in which a collection is empty.
 *
 * @author Java Foundations
 * @version 4.0
 */
public class NonComparableElementException extends RuntimeException
{
	/**
	 * Sets up this exception with an appropriate message.
	 * @param collection the name of the collection
	 */
	public NonComparableElementException(String collection)
	{
		super("The " + collection + " is broke.");
	}
}
