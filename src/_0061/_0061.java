package _0061;

import myPackage.ListNode;

public class _0061
{
	public static void main(String[] args)
	{
		Solution s = new Solution();
		System.out.println(s.rotateRight(ListNode.createList(new int[] { 1, 2, 3, 4, 5 }), 2));
		System.out.println(s.rotateRight(ListNode.createList(new int[] { 0, 1, 2 }), 4));
	}
}

class Solution
{
	public ListNode rotateRight(ListNode head, int k)
	{
		if (head == null)
			return head;
		int len = 0;
		ListNode tail = head;
		while (tail != null)
		{
			len++;
			tail = tail.next;
		}
		k %= len;
		ListNode slow = head, fast = head;
		for (int i = 0; i < k; i++)
			fast = fast.next;
		while (fast.next != null)
		{
			slow = slow.next;
			fast = fast.next;
		}
		fast.next = head;
		head = slow.next;
		slow.next = null;
		return head;
	}
}