package DataStructure;

public class SLinkedList {
	public SListNode head;
	public int size;
	// Construct the List
	public SLinkedList() {
		head = new SListNode();
		size = 0;
	}

	public boolean isEmpty() {
		return head.next == null;
	}

	public void makeEmpty() {
		head.next = null;
	}

	public void addFirst(SListNode v) {
		v.setNext(head);
		head = v;
		size++;
	}

	public void addLast(SListNode v) {
		v.setNext(null);
		SListNode tail = head;
		while (tail.next != null) {
			tail = tail.next;
		}
		tail.next = v;
		size++;
	}
}