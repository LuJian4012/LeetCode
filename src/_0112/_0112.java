package _0112;

import myPackage.TreeNode;

public class _0112
{
	public static void main(String[] args)
	{
		Solution s = new Solution();
		System.out.println(s.hasPathSum(
				TreeNode.createTree(new Integer[] { 5, 4, 8, 11, null, 13, 4, 7, 2, null, null, null, null, null, 1 }),
				22));
	}
}

class Solution
{
	public boolean hasPathSum(TreeNode root, int sum)
	{
		if (root == null)
			return false;
		if (root.left == null && root.right == null)
			return root.val == sum;
		return hasPathSum(root.left, sum - root.val) || hasPathSum(root.right, sum - root.val);
	}
}