package _0129;

import myPackage.TreeNode;

public class _0129
{
	public static void main(String[] args)
	{
		Solution s = new Solution();
		System.out.println(s.sumNumbers(TreeNode.createTree(new Integer[] { 1, 2, 3 })));
		System.out.println(s.sumNumbers(TreeNode.createTree(new Integer[] { 4, 9, 0, 5, 1 })));
	}
}

class Solution
{
	int sum;

	public int sumNumbers(TreeNode root)
	{
		sum = 0;
		helper(root, 0);
		return sum;
	}

	private void helper(TreeNode root, int tempSum)
	{
		if (root == null)
			return;
		tempSum = tempSum * 10 + root.val;
		if (root.left == null && root.right == null)
		{
			sum += tempSum;
		}
		helper(root.left, tempSum);
		helper(root.right, tempSum);
	}
}