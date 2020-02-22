package _0106;

import java.util.HashMap;

import myPackage.TreeNode;

public class _0106
{
	public static void main(String[] args)
	{
		Solution s = new Solution();
		TreeNode root = s.buildTree(new int[] { 9, 3, 15, 20, 7 }, new int[] { 9, 15, 7, 20, 3 });
		System.out.println(root);
	}
}

class Solution
{
	private int[] postorder;
	private HashMap<Integer, Integer> map;

	public TreeNode buildTree(int[] inorder, int[] postorder)
	{
		if (postorder == null || postorder.length == 0 || inorder == null || inorder.length == 0)
			return null;
		this.postorder = postorder;
		map = new HashMap<>();
		for (int i = 0; i < inorder.length; i++)
			map.put(inorder[i], i);
		return buildTree(postorder.length - 1, 0, inorder.length - 1);
	}

	private TreeNode buildTree(int endPost, int startIn, int endIn)
	{
		if (endIn - startIn < 0)
			return null;
		int rootPost = endPost;
		int rootIn = map.get(postorder[rootPost]);
		TreeNode root = new TreeNode(postorder[rootPost]);
		int rightNum = endIn - rootIn;
		root.right = buildTree(endPost - 1, rootIn + 1, endIn);
		root.left = buildTree(endPost - rightNum - 1, startIn, rootIn - 1);
		return root;
	}
}