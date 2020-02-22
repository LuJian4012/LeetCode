package _LCOF._006;

import java.util.Arrays;

import myPackage.ListNode;

public class _006
{
	public static void main(String[] args)
	{
		test(ListNode.createList(new int[] { 2, 3, 1 }));
	}

	private static void test(ListNode head)
	{
		Solution s = new Solution();
		System.out.println(Arrays.toString(s.reversePrint(head)));
	}
}

class Solution
{
	public int[] reversePrint(ListNode head)
	{
		if (head == null)
			return new int[0];
		int len = 0;
		ListNode iter = head;
		while (iter != null)
		{
			++len;
			iter = iter.next;
		}
		int[] res = new int[len];
		for (int i = len - 1; i >= 0; i--)
		{
			res[i] = head.val;
			head = head.next;
		}
		return res;
	}
}