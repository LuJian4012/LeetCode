package _0103;

import java.util.LinkedList;
import java.util.List;
import myPackage.TreeNode;

public class _0103
{
	public static void main(String[] args)
	{
		Solution s = new Solution();
		List<List<Integer>> levels = s
				.zigzagLevelOrder(TreeNode.createTree(new Integer[] { 3, 9, 20, null, null, 15, 7 }));
		System.out.println(levels);
	}
}

class Solution
{
	private List<List<Integer>> levels = new LinkedList<>();

	public List<List<Integer>> zigzagLevelOrder(TreeNode root)
	{
		if (root != null)
			insert(root, 0);
		return levels;
	}

	private void insert(TreeNode node, int level)
	{
		if (level == levels.size())
			levels.add(new LinkedList<>());
		if (level % 2 == 0)
			levels.get(level).add(0, node.val);
		else
			levels.get(level).add(node.val);
		if (node.right != null)
			insert(node.right, level + 1);
		if (node.left != null)
			insert(node.left, level + 1);
	}
}