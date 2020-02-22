package _0144;

import java.util.LinkedList;
import java.util.List;
import java.util.Stack;

import myPackage.TreeNode;

public class _0144
{
	public static void main(String[] args)
	{
		Solution s = new Solution();
		System.out.println(s.preorderTraversal(TreeNode.createTree(new Integer[] { 1, null, 2, null, null, 3 })));
	}
}

class Solution
{
	List<Integer> list = new LinkedList<>();

	public List<Integer> preorderTraversal(TreeNode root)
	{
//		preTraversal(root);
//		return list;

		if (root != null)
		{
			Stack<TreeNode> stack = new Stack<>();
			stack.push(root);
			while (!stack.empty())
			{
				TreeNode node = stack.pop();
				list.add(node.val);
				if (node.right != null)
					stack.push(node.right);
				if (node.left != null)
					stack.push(node.left);
			}
		}
		return list;
	}

	private void preTraversal(TreeNode root)
	{
		if (root == null)
			return;
		list.add(root.val);
		preTraversal(root.left);
		preTraversal(root.right);
	}
}