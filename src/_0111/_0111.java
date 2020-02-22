package _0111;

import myPackage.TreeNode;

public class _0111
{
	public static void main(String[] args)
	{
		Solution s = new Solution();
		System.out.println(s.minDepth(TreeNode.createTree(new Integer[] { 3, 9, 20, null, null, 15, 7 })));
	}
}

class Solution
{
	public int minDepth(TreeNode root)
	{
		if (root == null)
			return 0;
		if (root.left == null)
			return minDepth(root.right) + 1;
		if (root.right == null)
			return minDepth(root.left) + 1;
		return Math.min(minDepth(root.left), minDepth(root.right)) + 1;
	}
}