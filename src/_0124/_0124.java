package _0124;

import myPackage.TreeNode;

public class _0124
{
	public static void main(String[] args)
	{
		Solution s = new Solution();
		System.out.println(s.maxPathSum(TreeNode.createTree(new Integer[] { 1, 2, 3 })));
		System.out.println(s.maxPathSum(TreeNode.createTree(new Integer[] { -10, 9, 20, null, null, 15, 7 })));
		System.out.println(s.maxPathSum(TreeNode.createTree(new Integer[] { 1, -1, 1, -1, 1, 1, 1 })));
	}
}

class Solution
{
	private int max;

	public int maxPathSum(TreeNode root)
	{
		max = Integer.MIN_VALUE;
		helper(root);
		return max;
	}

	private int helper(TreeNode root)
	{
		if (root == null)
			return 0;
		int left = Math.max(helper(root.left), 0);
		int right = Math.max(helper(root.right), 0);
		max = Math.max(max, root.val + left + right);
		return root.val + Math.max(left, right);
	}
}