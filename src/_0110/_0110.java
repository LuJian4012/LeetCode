package _0110;

import myPackage.TreeNode;

public class _0110
{
	public static void main(String[] args)
	{
		Solution s = new Solution();
		System.out.println(s.isBalanced(TreeNode.createTree(new Integer[] { 3, 9, 20, null, null, 15, 7 })));
		System.out.println(s.isBalanced(TreeNode.createTree(new Integer[] { 1, 2, 2, 3, 3, null, null, 4, 4 })));
	}
}

class Solution
{
	public boolean isBalanced(TreeNode root)
	{
		return height(root) >= 0;
	}

	private int height(TreeNode root)
	{
		if (root == null)
			return 0;
		int hl = height(root.left);
		int hr = height(root.right);
		if (hr < 0 || hl < 0 || Math.abs(hl - hr) > 1)
			return -1;
		return Math.max(hl, hr) + 1;
	}
}