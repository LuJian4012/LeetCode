package _0019;

import myPackage.ListNode;

public class _0019
{
	private static void test(int[] nums, int n)
	{
		Solution s = new Solution();
		ListNode list = ListNode.createList(nums);
		ListNode list2 = s.removeNthFromEnd(list, n);
		System.out.println(list2);
	}

	public static void main(String[] args)
	{
		test(new int[] { 1, 2, 3, 4, 5 }, 2);
		test(new int[] { 1, 2 }, 1);
	}

}

class Solution
{
	public ListNode removeNthFromEnd(ListNode head, int n)
	{
		ListNode tail = head, tail_n = head;
		for (int i = 0; i < n; i++)
			tail = tail.next;
		if (tail == null)
			return head.next;

		while (tail.next != null)
		{
			tail = tail.next;
			tail_n = tail_n.next;
		}
		tail_n.next = tail_n.next.next;
		return head;
	}
}