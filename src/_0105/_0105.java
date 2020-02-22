package _0105;

import java.util.HashMap;

import myPackage.TreeNode;

public class _0105
{
	public static void main(String[] args)
	{
		Solution s = new Solution();
		TreeNode root = s.buildTree(new int[] { 3, 9, 20, 15, 7 }, new int[] { 9, 3, 15, 20, 7 });
		System.out.println(root);
	}
}

class Solution
{
	private int[] preorder;
	private HashMap<Integer, Integer> map;

	public TreeNode buildTree(int[] preorder, int[] inorder)
	{
		if (preorder == null || preorder.length == 0 || inorder == null || inorder.length == 0)
			return null;
		this.preorder = preorder;
		map = new HashMap<>();
		for (int i = 0; i < inorder.length; i++)
			map.put(inorder[i], i);
		return buildTree(0, 0, inorder.length - 1);
	}

	private TreeNode buildTree(int startPre, int startIn, int endIn)
	{
		if (endIn - startIn < 0)
			return null;
		int rootPre = startPre;
		int rootIn = map.get(preorder[rootPre]);
		TreeNode root = new TreeNode(preorder[rootPre]);
		int leftNum = rootIn - startIn;
		root.left = buildTree(startPre + 1, startIn, rootIn - 1);
		root.right = buildTree(startPre + leftNum + 1, rootIn + 1, endIn);
		return root;
	}
}