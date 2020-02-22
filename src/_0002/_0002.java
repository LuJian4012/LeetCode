package _0002;

import myPackage.ListNode;

public class _0002
{
	public static void main(String[] args)
	{
		Solution s = new Solution();
		ListNode l1 = ListNode.createList(new int[] { 5 }), l2 = ListNode.createList(new int[] { 5 });
		System.out.println(l1 + " + " + l2 + " = " + new StringBuilder(s.addTwoNumbers(l1, l2).toString()).reverse());
	}
}

class Solution
{
	public ListNode addTwoNumbers(ListNode l1, ListNode l2)
	{
		ListNode dummyHead = new ListNode(0);
		int num1, num2, carry = 0, sum;
		ListNode temp = dummyHead;
		while (l1 != null || l2 != null)
		{
			num1 = num2 = 0;
			if (l1 != null)
			{
				num1 = l1.val;
				l1 = l1.next;
			}
			if (l2 != null)
			{
				num2 = l2.val;
				l2 = l2.next;
			}
			sum = num1 + num2 + carry;
			temp.next = new ListNode(sum % 10);
			temp = temp.next;
			carry = sum / 10;
		}
		if (carry > 0)
			temp.next = new ListNode(carry);
		return dummyHead.next;
	}
}