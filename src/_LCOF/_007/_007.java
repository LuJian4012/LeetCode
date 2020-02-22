package _LCOF._007;

import java.util.HashMap;

import myPackage.TreeNode;

public class _007
{
	public static void main(String[] args)
	{
		test(new int[] { 3, 9, 20, 15, 7 }, new int[] { 9, 3, 15, 20, 7 });
	}

	private static void test(int[] preorder, int[] inorder)
	{
		Solution s = new Solution();
		TreeNode root = s.buildTree(preorder, inorder);
		System.out.println(root);
	}
}

class Solution
{
	private int[] preorder;
	private int idx = 0;
	private HashMap<Integer, Integer> map = new HashMap<>();

	public TreeNode buildTree(int[] preorder, int[] inorder)
	{
		if (preorder == null || inorder == null || preorder.length == 0 || inorder.length == 0)
			return null;
		this.preorder = preorder;
		for (int i = 0; i < inorder.length; i++)
			map.put(inorder[i], i);
		return buidlTree(0, inorder.length - 1);
	}

	private TreeNode buidlTree(int start, int end)
	{
		if (start > end)
			return null;
		TreeNode root = new TreeNode(preorder[idx]);
		int index = map.get(preorder[idx]);
		idx++;
		root.left = buidlTree(start, index - 1);
		root.right = buidlTree(index + 1, end);
		return root;
	}
}