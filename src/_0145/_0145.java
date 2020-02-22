package _0145;

import java.util.LinkedList;
import java.util.List;
import java.util.Stack;

import myPackage.TreeNode;

public class _0145
{
	public static void main(String[] args)
	{
		Solution s = new Solution();
		System.out.println(s.postorderTraversal(TreeNode.createTree(new Integer[] { 1, null, 2, null, null, 3 })));
	}
}

class Solution
{
	LinkedList<Integer> list = new LinkedList<>();

	public List<Integer> postorderTraversal(TreeNode root)
	{
//		postTraversal(root);
//		return list;

		if (root != null)
		{
			Stack<TreeNode> stack = new Stack<>();
			stack.push(root);
			while (!stack.empty())
			{
				TreeNode node = stack.pop();
				list.addFirst(node.val);
				if (node.left != null)
					stack.push(node.left);
				if (node.right != null)
					stack.push(node.right);
			}
		}
		return list;
	}

	private void postTraversal(TreeNode root)
	{
		if (root == null)
			return;
		postTraversal(root.left);
		postTraversal(root.right);
		list.add(root.val);
	}
}