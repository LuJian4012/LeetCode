package myPackage;

public class ListNode
{
	public int val;
	public ListNode next;

	public ListNode(int x)
	{
		val = x;
	}

	public static ListNode createList(int[] nums)
	{
		ListNode head = new ListNode(0), temp = head;
		for (int num : nums)
		{
			temp.next = new ListNode(num);
			temp = temp.next;
		}
		return head.next;
	}

	@Override
	public String toString()
	{
		StringBuilder sb = new StringBuilder("[");
		ListNode temp = this;
		while (temp != null)
		{
			sb.append(temp.val);
			if (temp.next != null)
				sb.append(", ");
			temp = temp.next;
		}
		sb.append("]");
		return sb.toString();
	}
}