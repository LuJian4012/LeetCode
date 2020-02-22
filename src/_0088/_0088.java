package _0088;

import java.util.Arrays;

public class _0088
{
	public static void main(String[] args)
	{
		test(new int[] { 1, 2, 3, 0, 0, 0 }, 3, new int[] { 2, 5, 6 }, 3);
	}

	private static void test(int[] nums1, int m, int[] nums2, int n)
	{
		Solution s = new Solution();
		s.merge(nums1, m, nums2, n);
		System.out.println(Arrays.toString(nums1));
	}
}

class Solution
{
	public void merge(int[] nums1, int m, int[] nums2, int n)
	{
		int idx1 = m - 1, idx2 = n - 1, idx3 = m + n - 1;
		while (idx1 >= 0 && idx2 >= 0)
		{
			if (nums1[idx1] > nums2[idx2])
				nums1[idx3--] = nums1[idx1--];
			else
				nums1[idx3--] = nums2[idx2--];
		}
		while (idx2 >= 0)
			nums1[idx3--] = nums2[idx2--];
	}
}