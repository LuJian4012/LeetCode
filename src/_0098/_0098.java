package _0098;

import myPackage.TreeNode;

public class _0098
{
	public static void main(String[] args)
	{
		Solution s = new Solution();
		System.out.println(s.isValidBST(TreeNode.createTree(new Integer[] { 2, 1, 3 })));
		System.out.println(s.isValidBST(TreeNode.createTree(new Integer[] { 5, 1, 4, null, null, 3, 6 })));
		System.out.println(s.isValidBST(TreeNode.createTree(new Integer[] { 10, 5, 15, null, null, 6, 20 })));
	}
}

class Solution
{
	public boolean isValidBST(TreeNode root)
	{
		return isValidBST(root, null, null);
	}

	private boolean isValidBST(TreeNode root, Integer Upper, Integer Lower)
	{
		if (root == null)
			return true;
		if (root.left != null && root.val <= root.left.val)
			return false;
		if (root.right != null && root.val >= root.right.val)
			return false;
		if (Upper != null && root.val >= Upper)
			return false;
		if (Lower != null && root.val <= Lower)
			return false;
		return isValidBST(root.left, root.val, Lower) && isValidBST(root.right, Upper, root.val);
	}
}