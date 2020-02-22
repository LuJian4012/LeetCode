package _0116;

import myPackage.Node;

public class _0116
{
	public static void main(String[] args)
	{
		Solution s = new Solution();
		System.out.println(s.connect(Node.createTree(new Integer[] { 1, 2, 3, 4, 5, 6, 7 })));
	}
}

class Solution
{
	public Node connect(Node root)
	{
		if (root == null || root.left == null && root.right == null)
			return root;
		root.left.next = root.right;
		if (root.next != null)
			root.right.next = root.next.left;
		root.right = connect(root.right);
		root.left = connect(root.left);
		return root;
	}
}