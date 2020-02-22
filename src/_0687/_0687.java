package _0687;

import myPackage.TreeNode;

public class _0687
{
	public static void main(String[] args)
	{
		Solution s = new Solution();
		System.out.println(s.longestUnivaluePath(TreeNode.createTree(new Integer[] { 5, 4, 5, 1, 1, null, 5 })));
		System.out.println(s.longestUnivaluePath(TreeNode.createTree(new Integer[] { 1, 4, 5, 4, 4, null, 5 })));
	}
}

class Solution
{
	int max;

	public int longestUnivaluePath(TreeNode root)
	{
		max = 0;
		if (root == null)
			return 0;
		helper(root);
		return max;

	}

	private int helper(TreeNode root)
	{
		if (root.left == null && root.right == null)
			return 0;
		if(root.right==null)
			return root.val==root.left.val?helper(root.left)+1:0;
		int 
	}
}