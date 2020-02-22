package _0220;

public class _0220
{
	public static void main(String[] args)
	{
		Solution s = new Solution();
		System.out.println(s.containsNearbyAlmostDuplicate(new int[] { 1, 2, 3, 1 }, 3, 0));
		System.out.println(s.containsNearbyAlmostDuplicate(new int[] { 1, 0, 1, 1 }, 1, 2));
		System.out.println(s.containsNearbyAlmostDuplicate(new int[] { 1, 5, 9, 1, 5, 9 }, 2, 3));
	}
}

class Solution
{
	public boolean containsNearbyAlmostDuplicate(int[] nums, int k, int t)
	{
		if (nums.length >= k)
		{
			for (int left = 0; left < nums.length - k; left++)
			{
				int right = left + k;
				if (Math.abs(nums[right] - nums[left]) == t)
					return true;
			}
		}
		return false
	}
}