package myPackage;

import java.util.LinkedList;

public class Node
{
	public int val;
	public Node left;
	public Node right;
	public Node next;

	public Node()
	{
	}

	public Node(int _val)
	{
		val = _val;
	}

	public Node(int _val, Node _left, Node _right, Node _next)
	{
		val = _val;
		left = _left;
		right = _right;
		next = _next;
	}

	public static Node createTree(Integer[] nums)
	{
		if (nums == null || nums.length == 0 || nums[0] == null)
			return null;
		Node[] nodes = new Node[nums.length + 1];
		nodes[1] = new Node(nums[0]);
		for (int i = 1; i < nums.length; i++)
		{
			int cur = i + 1, parent = cur / 2;
			if (nums[i] == null)
				continue;
			nodes[cur] = new Node(nums[i]);
			if (cur % 2 == 0)
				nodes[parent].left = nodes[cur];
			else
				nodes[parent].right = nodes[cur];
		}
		return nodes[1];
	}

	@Override
	public String toString()
	{
		StringBuilder sb = new StringBuilder("[");
		LinkedList<Node> queue = new LinkedList<>();
		queue.add(this);
		while (!queue.isEmpty())
		{
			Node node = queue.removeFirst();
			if (node.left != null)
				queue.add(node.left);
			if (node.right != null)
				queue.add(node.right);
			sb.append(node.val);
			if (node.next == null)
				sb.append(", #");
			if (!queue.isEmpty())
				sb.append(", ");
		}
		sb.append("]");
		return sb.toString();
	}
};