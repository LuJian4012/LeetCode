package _0095;

import java.util.LinkedList;
import java.util.List;
import myPackage.TreeNode;

public class _0095
{
	public static void main(String[] args)
	{
		Solution s = new Solution();
		List<TreeNode> trees = s.generateTrees(3);
		System.out.println(trees);
	}
}

class Solution
{
	public List<TreeNode> generateTrees(int n)
	{
		if (n == 0)
			return new LinkedList<>();
		return generateTrees(1, n);
	}

	private List<TreeNode> generateTrees(int start, int end)
	{
		List<TreeNode> trees = new LinkedList<TreeNode>();
		if (start > end)
		{
			trees.add(null);
		}
		for (int i = start; i <= end; i++)
		{
			List<TreeNode> lefts = generateTrees(start, i - 1);
			List<TreeNode> rights = generateTrees(i + 1, end);
			for (TreeNode left : lefts)
				for (TreeNode right : rights)
				{
					TreeNode root = new TreeNode(i);
					root.left = left;
					root.right = right;
					trees.add(root);
				}
		}
		return trees;
	}
}