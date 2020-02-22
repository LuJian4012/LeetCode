package _0117;

import myPackage.Node;

public class _0117
{
	public static void main(String[] args)
	{
		Solution s = new Solution();
		System.out.println(s.connect(Node.createTree(new Integer[] { 1, 2, 3, 4, 5, null, 7 })));
		System.out.println(s.connect(Node.createTree(
				new Integer[] { 2, 1, 3, 0, 7, 9, 1, 2, null, 1, 0, null, null, 8, 8, null, null, null, null, 7 })));
	}
}

class Solution
{
	public Node connect(Node root)
	{
		if (root == null || root.left == null && root.right == null)
			return root;
		if (root.left != null && root.right != null)
		{
			root.left.next = root.right;
			root.right.next = getNextNotNullChild(root);
		}
		if (root.left == null)
			root.right.next = getNextNotNullChild(root);
		if (root.right == null)
			root.left.next = getNextNotNullChild(root);
		root.right = connect(root.right);
		root.left = connect(root.left);
		return root;
	}

	private Node getNextNotNullChild(Node root)
	{
		while (root.next != null)
		{
			root = root.next;
			if (root.left != null)
				return root.left;
			if (root.right != null)
				return root.right;
		}
		return null;
	}
}