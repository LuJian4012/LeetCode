package _0024;

import myPackage.ListNode;

public class _0024
{
	private static void test(int[] nums)
	{
		Solution s = new Solution();
		ListNode list = ListNode.createList(nums);
		ListNode list2 = s.swapPairs(list);
		System.out.println(list2);
	}

	public static void main(String[] args)
	{
		test(new int[] { 1, 2, 3, 4 });
	}
}

class Solution
{
	public ListNode swapPairs(ListNode head)
	{
		if (head == null)
			return null;
		ListNode newHead = new ListNode(0);
		newHead.next = head;
		ListNode preNode = newHead, node1 = null, node2 = null;
		while (preNode.next != null && preNode.next.next != null)
		{
			node1 = preNode.next;
			node2 = node1.next;
			preNode.next = node2;
			node1.next = node2.next;
			node2.next = node1;
			preNode = node1;
		}
		return newHead.next;
	}
}