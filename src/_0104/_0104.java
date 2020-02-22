package _0104;

import myPackage.TreeNode;

public class _0104
{
	public static void main(String[] args)
	{
		Solution s = new Solution();
		System.out.println(s.maxDepth(TreeNode.createTree(new Integer[] { 3, 9, 20, null, null, 15, 7 })));
	}
}

class Solution
{
	public int maxDepth(TreeNode root)
	{
		if (root == null)
			return 0;
		return Math.max(maxDepth(root.left), maxDepth(root.right)) + 1;
	}
}