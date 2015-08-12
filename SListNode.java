package DataStructures;

public class SListNode {
	Object element;
	SListNode next;
	public SListNode (Object theElement) {
		element = theElement;
	}
	public SListNode (Object theElement, SListNode theNext) {
		element = theElement;
		next = theNext;
	}
	// Return the element of this node
	public Object getElement() {
		return element;
	}
	public SListNode getNext() {
		return next;
	}
	public void setElement(Object newElement) {
		element = newElement;
	}
	public void setNext(SListNode newNext) {
		next = newNext;
	}
}