/*
Write a GetNth() function that takes a linked list and an integer index and returns the data value stored in the node at that index position.
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
	public ListNode getNthNode(ListNode head, int n) {
		int count = 0;
		ListNode cur = head;
		while (cur != null) {
			if (count == n) {
				return cur;
			}
			count++;
			cur = cur.next;
		}
		return null;
	}
}