package _0108;

import myPackage.TreeNode;

public class _0108
{
	public static void main(String[] args)
	{
		Solution s = new Solution();
		TreeNode root = s.sortedArrayToBST(new int[] { -10, -3, 0, 5, 9 });
		System.out.println(root);
	}
}

class Solution
{
	public TreeNode sortedArrayToBST(int[] nums)
	{
		return sortedArrayToBST(nums, 0, nums.length - 1);
	}

	private TreeNode sortedArrayToBST(int[] nums, int left, int right)
	{
		if (left > right)
			return null;
		int mid = left + (right - left) / 2;
		TreeNode node = new TreeNode(nums[mid]);
		node.left = sortedArrayToBST(nums, left, mid - 1);
		node.right = sortedArrayToBST(nums, mid + 1, right);
		return node;
	}
}