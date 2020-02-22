package myPackage;

public class TreeNode
{
	public int val;
	public TreeNode left;
	public TreeNode right;

	public TreeNode(int x)
	{
		val = x;
	}

	public static TreeNode createTree(Integer[] nums)
	{
		if (nums == null || nums.length == 0 || nums[0] == null)
			return null;
		TreeNode[] nodes = new TreeNode[nums.length + 1];
		nodes[1] = new TreeNode(nums[0]);
		for (int i = 1; i < nums.length; i++)
		{
			int cur = i + 1, parent = cur / 2;
			if (nums[i] == null)
				continue;
			nodes[cur] = new TreeNode(nums[i]);
			if (cur % 2 == 0)
				nodes[parent].left = nodes[cur];
			else
				nodes[parent].right = nodes[cur];
		}
		return nodes[1];
	}
}