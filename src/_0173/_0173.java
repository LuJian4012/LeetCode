package _0173;

import java.util.Stack;

import myPackage.TreeNode;

public class _0173
{
	public static void main(String[] args)
	{
		BSTIterator iter = new BSTIterator(TreeNode.createTree(new Integer[] { 7, 3, 15, null, null, 9, 20 }));
		System.out.println(iter.next());
		System.out.println(iter.next());
		System.out.println(iter.hasNext());
		System.out.println(iter.next());
		System.out.println(iter.hasNext());
		System.out.println(iter.next());
		System.out.println(iter.hasNext());
		System.out.println(iter.next());
		System.out.println(iter.hasNext());
	}
}

class BSTIterator
{
	Stack<TreeNode> stack;

	public BSTIterator(TreeNode root)
	{
		stack = new Stack<>();
		while (root != null)
		{
			stack.push(root);
			root = root.left;
		}
	}

	public int next()
	{
		TreeNode node = stack.pop();
		int ret = node.val;
		node = node.right;
		while (node != null)
		{
			stack.push(node);
			node = node.left;
		}
		return ret;
	}

	public boolean hasNext()
	{
		return !stack.empty();
	}
}