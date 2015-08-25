
/*
Write a function that searches a given key ‘x’ in a given singly linked list. The function should return true if x is present in linked list and false otherwise.
*/


/**
* Definition for singly-linked list.
* public class ListNode {
*     int val;
*     ListNode next;
*     ListNode(int x) { val = x; }
* }
*/

public class Solution {
	public boolean search(ListNode head, int val) {
		if (head == null) {
			return false;
		}
		while (head != null) {
			if (head.val == val) {
				return true;
			}
			head = head.next;
		}
		return false;
	}
}


public class Solution {
	public boolean search(ListNode head, int val) {
		if (head == null) {
			return false;
		}
		if (head.val == val) {
			return true;
		} 

		return search(head.next, val);
	}
}
