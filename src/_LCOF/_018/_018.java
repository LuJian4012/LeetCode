package _LCOF._018;

import myPackage.ListNode;

public class _018
{
	public static void main(String[] args)
	{
		test(ListNode.createList(new int[] { 4, 5, 1, 9 }), 5);
		test(ListNode.createList(new int[] { 4, 5, 1, 9 }), 1);
	}

	private static void test(ListNode head, int val)
	{
		Solution s = new Solution();
		System.out.println(s.deleteNode(head, val));
	}
}

class Solution
{
	public ListNode deleteNode(ListNode head, int val)
	{
		ListNode preNode = new ListNode(0);
		preNode.next = head;
		ListNode temp = preNode;
		while (temp.next != null)
		{
			if (temp.next.val == val)
				temp.next = temp.next.next;
			else
				temp = temp.next;
		}
		return preNode.next;
	}
}