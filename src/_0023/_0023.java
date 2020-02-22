package _0023;

import myPackage.ListNode;

public class _0023
{
	public static void main(String[] args)
	{
		Solution s = new Solution();
		System.out.println(s.mergeKLists(new ListNode[] { ListNode.createList(new int[] { 1, 4, 5 }),
				ListNode.createList(new int[] { 1, 3, 4 }), ListNode.createList(new int[] { 2, 6 }) }));
	}
}

class Solution
{
	public ListNode mergeKLists(ListNode[] lists)
	{
		if (lists == null || lists.length == 0)
			return null;
		return mergeKLists(lists, 0, lists.length - 1);
	}

	private ListNode mergeKLists(ListNode[] lists, int left, int right)
	{
		if (left == right)
			return lists[left];
		if (left + 1 == right)
			return mergeTwoLists(lists[left], lists[right]);
		int mid = (left + right) / 2;
		ListNode l1 = mergeKLists(lists, left, mid);
		ListNode l2 = mergeKLists(lists, mid + 1, right);
		return mergeTwoLists(l1, l2);
	}

	private ListNode mergeTwoLists(ListNode l1, ListNode l2)
	{
		// µü´ú°æ±¾
		ListNode list = new ListNode(0), temp = list;
		while (l1 != null && l2 != null)
		{
			if (l1.val < l2.val)
			{
				temp.next = l1;
				l1 = l1.next;
			}
			else
			{
				temp.next = l2;
				l2 = l2.next;
			}
			temp = temp.next;
		}
		temp.next = (l1 != null) ? l1 : l2;
		return list.next;
		/*// µÝ¹é°æ±¾
		if (l1 == null)
			return l2;
		if (l2 == null)
			return l1;
		if (l1.val < l2.val)
		{
			l1.next = mergeTwoLists(l1.next, l2);
			return l1;
		}
		else
		{
			l2.next = mergeTwoLists(l1, l2.next);
			return l2;
		}*/
	}
}