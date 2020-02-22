package _0109;

import myPackage.ListNode;
import myPackage.TreeNode;

public class _0109
{
	public static void main(String[] args)
	{
		Solution s = new Solution();
		System.out.println(s.sortedListToBST(ListNode.createList(new int[] { -10, -3, 0, 5, 9 })));
	}
}

class Solution
{
	public TreeNode sortedListToBST(ListNode head)
	{
		if (head == null)
			return null;
		if (head.next == null)
			return new TreeNode(head.val);
		ListNode slow = head, fast = slow.next.next;
		while (fast != null && fast.next != null)
		{
			slow = slow.next;
			fast = fast.next.next;
		}
		TreeNode root = new TreeNode(slow.next.val);
		root.right = sortedListToBST(slow.next.next);
		slow.next = null;
		root.left = sortedListToBST(head);
		return root;
	}
}