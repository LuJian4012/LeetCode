package _0027;

public class _0027
{
	private static void test(int[] nums, int val)
	{
		Solution s = new Solution();
		int len = s.removeElement(nums, val);
		System.out.println("len = " + len);
		for (int i = 0; i < len; i++)
			System.out.print(nums[i] + " ");
		System.out.println();
	}

	public static void main(String[] args)
	{
		test(new int[] { 3, 2, 2, 3 }, 3);
		test(new int[] { 0, 1, 2, 2, 3, 0, 4, 2 }, 2);
		test(new int[] { 2 }, 3);
	}
}

class Solution
{
	public int removeElement(int[] nums, int val)
	{
		int slow = 0, fast = 0;
		while (fast < nums.length)
		{
			if (nums[fast] != val)
				nums[slow++] = nums[fast++];
			else
				fast++;
		}
		return slow;
	}
}