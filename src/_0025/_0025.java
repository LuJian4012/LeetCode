package _0025;

import myPackage.ListNode;

public class _0025
{

	private static void test(int[] nums, int k)
	{
		Solution s = new Solution();
		ListNode list = ListNode.createList(nums);
		ListNode list2 = s.reverseKGroup(list, k);
		System.out.println(list2);
	}

	public static void main(String[] args)
	{
		test(new int[] { 1, 2, 3, 4, 5 }, 2);
		test(new int[] { 1, 2, 3, 4, 5 }, 3);
	}
}

class Solution
{
	public ListNode reverseKGroup(ListNode head, int k)
	{
		if (head == null || k == 1)
			return head;
		ListNode temp = head;
		for (int i = 0; i < k; i++)
		{
			if (temp == null)
				return head;
			temp = temp.next;
		}
		ListNode cur = head, pre = head.next;
		for (int i = 0; i < k - 1; i++)
		{
			temp = pre.next;
			pre.next = cur;
			cur = pre;
			pre = temp;
		}
		head.next = reverseKGroup(pre, k);
		return cur;
	}
}