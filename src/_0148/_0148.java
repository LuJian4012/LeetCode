package _0148;

import java.util.Comparator;
import java.util.PriorityQueue;

import myPackage.ListNode;

public class _0148
{
	public static void main(String[] args)
	{
		Solution s = new Solution();
		System.out.println(s.sortList(ListNode.createList(new int[] { 4, 2, 1, 3 })));
		System.out.println(s.sortList(ListNode.createList(new int[] { -1, 5, 3, 4, 0 })));
	}
}

class Solution
{
	public ListNode sortList(ListNode head)
	{
		// ∂—≈≈–Ú
//		PriorityQueue<ListNode> heap = new PriorityQueue<>(new Comparator<ListNode>()
//		{
//			public int compare(ListNode o1, ListNode o2)
//			{
//				if (o1.val < o2.val)
//					return -1;
//				if (o1.val > o2.val)
//					return 1;
//				return 0;
//			};
//		});
//		ListNode preNode = new ListNode(0), cur = head;
//		preNode.next = head;
//		while (cur != null)
//		{
//			heap.add(cur);
//			cur = cur.next;
//		}
//		cur = preNode;
//		while (cur != null)
//		{
//			cur.next = heap.poll();
//			cur = cur.next;
//		}
//		return preNode.next;
		// πÈ≤¢≈≈–Ú
		if (head == null || head.next == null)
			return head;
		ListNode slow = head, fast = slow.next;
		while (fast != null && fast.next != null)
		{
			slow = slow.next;
			fast = fast.next.next;
		}
		ListNode mid = slow.next;
		slow.next = null;
		ListNode l1 = sortList(head);
		ListNode l2 = sortList(mid);
//		return merge(l1, l2);
		ListNode preNode = new ListNode(0), cur = preNode;
		while (l1 != null && l2 != null)
		{
			if (l1.val <= l2.val)
			{
				cur.next = l1;
				l1 = l1.next;
			}
			else
			{
				cur.next = l2;
				l2 = l2.next;
			}
			cur = cur.next;
		}
		cur.next = l1 == null ? l2 : l1;
		return preNode.next;
	}

//	private ListNode merge(ListNode l1, ListNode l2)
//	{
//		if (l1 == null)
//			return l2;
//		if (l2 == null)
//			return l1;
//		if (l1.val <= l2.val)
//		{
//			l1.next = merge(l1.next, l2);
//			return l1;
//		}
//		else
//		{
//			l2.next = merge(l1, l2.next);
//			return l2;
//		}
//	}
}