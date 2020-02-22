package _0021;

import myPackage.ListNode;

public class _0021
{
	private static ListNode mergeTwoLists(ListNode l1, ListNode l2)
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

	public static void main(String[] args)
	{
		System.out.println(
				mergeTwoLists(ListNode.createList(new int[] { 1, 2, 4 }), ListNode.createList(new int[] { 1, 3, 4 })));
	}
}
