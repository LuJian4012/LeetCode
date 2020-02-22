package _0113;

import java.util.ArrayList;
import java.util.List;

import myPackage.TreeNode;

public class _0113
{
	public static void main(String[] args)
	{
		Solution s = new Solution();
		System.out.println(s.pathSum(
				TreeNode.createTree(new Integer[] { 5, 4, 8, 11, null, 13, 4, 7, 2, null, null, null, null, 5, 1 }),
				22));
	}
}

class Solution
{
	List<List<Integer>> paths = new ArrayList<>();
	ArrayList<Integer> path = new ArrayList<>();

	public List<List<Integer>> pathSum(TreeNode root, int sum)
	{
		helper(root, sum);
		return paths;
	}

	private void helper(TreeNode root, int sum)
	{
		if (root == null)
			return;
		path.add(root.val);
		sum -= root.val;
		if (root.left == null && root.right == null && sum == 0)
			paths.add(new ArrayList<>(path));
		else
		{
			helper(root.left, sum);
			helper(root.right, sum);
		}
		path.remove(path.size() - 1);
		sum += root.val;
	}
}