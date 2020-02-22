package _0114;

import myPackage.TreeNode;

public class _0114
{
	public static void main(String[] args)
	{
		test(new Integer[] { 1, 2, 5, 3, 4, null, 6 });
	}

	private static void test(Integer[] nums)
	{
		Solution s = new Solution();
		TreeNode root = TreeNode.createTree(nums);
		s.flatten(root);
		System.out.println(root);
	}
}

class Solution
{
	public void flatten(TreeNode root)
	{
		while (root != null)
		{
			if (root.left != null)
			{
				if (root.right != null)
				{
					TreeNode post = root.left;
					while (post.right != null)
						post = post.right;
					post.right = root.right;
				}
				root.right = root.left;
				root.left = null;
			}
			root = root.right;
		}
	}
}