package _0094;

import java.util.ArrayList;
import java.util.List;
import java.util.Stack;

import myPackage.TreeNode;

public class _0094
{

	public static void main(String[] args)
	{
		test(new Integer[] { 1, null, 2, null, null, 3 });
	}

	private static void test(Integer[] nums)
	{
		Solution s = new Solution();
		TreeNode root = TreeNode.createTree(nums);
		System.out.println(s.inorderTraversal(root));
	}
}

class Solution
{
	public List<Integer> inorderTraversal(TreeNode root)
	{
		TreeNode temp = root;
		List<Integer> list = new ArrayList<>();
		Stack<TreeNode> stack = new Stack<>();
		while (temp != null || !stack.isEmpty())
		{
			while (temp != null)
			{
				stack.add(temp);
				temp = temp.left;
			}
			if (!stack.isEmpty())
			{
				temp = stack.pop();
				list.add(temp.val);
				temp = temp.right;
			}
		}
		return list;
	}
}