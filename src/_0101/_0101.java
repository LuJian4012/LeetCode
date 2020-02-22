package _0101;

import myPackage.TreeNode;

public class _0101
{
	public static void main(String[] args)
	{
		Solution s = new Solution();
		System.out.println(s.isSymmetric(TreeNode.createTree(new Integer[] { 1, 2, 2, 3, 4, 4, 3 })));
		System.out.println(s.isSymmetric(TreeNode.createTree(new Integer[] { 1, 2, 2, null, 3, null, 3 })));
	}
}

class Solution
{
	public boolean isSymmetric(TreeNode root)
	{
		return root == null || isSymmetric(root.left, root.right);
	}

	private boolean isSymmetric(TreeNode t1, TreeNode t2)
	{
		if (t1 == null && t2 == null)
			return true;
		if (t1 == null || t2 == null)
			return false;
		return (t1.val == t2.val) && isSymmetric(t1.left, t2.right) && isSymmetric(t1.right, t2.left);
	}
}