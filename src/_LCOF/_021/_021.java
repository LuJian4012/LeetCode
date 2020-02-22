package _LCOF._021;

import java.util.Arrays;

public class _021
{
	public static void main(String[] args)
	{
		test(new int[] { 1, 2, 3, 4 });
	}

	private static void test(int[] nums)
	{
		Solution s = new Solution();
		System.out.println(Arrays.toString(s.exchange(nums)));
	}
}

class Solution
{
	public int[] exchange(int[] nums)
	{
		int i = 0, j = nums.length - 1;
		while (i <= j)
		{
			if (nums[i] % 2 == 0)
			{
				while (i <= j)
				{
					if (nums[j] % 2 == 1)
					{
						int temp = nums[i];
						nums[i] = nums[j];
						nums[j--] = temp;
						break;
					}
					else
						j--;
				}
			}
			else
				i++;
		}
		return nums;
	}
}