package _0100;

import myPackage.TreeNode;

public class _0100
{
	public static void main(String[] args)
	{
		Solution s = new Solution();
		System.out.println(s.isSameTree(TreeNode.createTree(new Integer[] { 1, 2, 3 }),
				TreeNode.createTree(new Integer[] { 1, 2, 3 })));
		System.out.println(s.isSameTree(TreeNode.createTree(new Integer[] { 1, 2 }),
				TreeNode.createTree(new Integer[] { 1, null, 2 })));
	}
}

class Solution
{
	public boolean isSameTree(TreeNode p, TreeNode q)
	{
		if (p == null && q == null)
			return true;
		if (p == null || q == null)
			return false;
		return p.val == q.val && isSameTree(p.left, q.left) && isSameTree(p.right, q.right);
	}
}