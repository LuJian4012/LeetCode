package _0147;

import myPackage.ListNode;

public class _0147
{
	public static void main(String[] args)
	{
		Solution s = new Solution();
		System.out.println(s.insertionSortList(ListNode.createList(new int[] { 4, 2, 1, 3 })));
		System.out.println(s.insertionSortList(ListNode.createList(new int[] { -1, 5, 3, 4, 0 })));
	}
}

class Solution
{
	public ListNode insertionSortList(ListNode head)
	{
		ListNode preNode = new ListNode(0);
		preNode.next = head;
		ListNode cur, tail = preNode;
		while (tail.next != null)
		{
			cur = tail.next;
			ListNode iter = preNode;
			while (iter != tail && cur.val > iter.next.val)
			{
				iter = iter.next;
			}
			tail.next = cur.next;
			cur.next = iter.next;
			iter.next = cur;
			if (iter == tail)
				tail = tail.next;
		}
		return preNode.next;
	}
}