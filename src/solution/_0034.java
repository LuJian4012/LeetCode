package solution;

public class _0034
{
	private static int[] searchRange(int[] nums, int target)
	{
		int left = 0, right = nums.length - 1, mid;
		while (left <= right)
		{
			mid = (left + right) / 2;
			if (nums[mid] < target)
				left = mid + 1;
			else if (nums[mid] > target)
				right = mid - 1;
			else
			{
				left = right = mid;
				while (left > 0 && nums[left - 1] == target) left--;
				while (right < nums.length - 1 && nums[right + 1] == target) right++;
				return new int[] { left, right };
			}
		}
		return new int[] { -1, -1 };
	}

	private static void test(int[] nums, int target)
	{
		int[] res = searchRange(nums, target);
		for (int i : res) System.out.print(i + " ");
		System.out.println();
	}

	public static void main(String[] args)
	{
		test(new int[] { 5, 7, 7, 8, 8, 10 }, 8);
		test(new int[] { 5, 7, 7, 8, 8, 10 }, 6);
		test(new int[] { 1, 3 }, 1);
		test(new int[] { 1 }, 1);
	}

}