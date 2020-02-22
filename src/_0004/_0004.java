package _0004;

public class _0004
{
	public static void main(String[] args)
	{
		test(new int[] { 1, 2 }, new int[] { 3, 4 });
		test(new int[] { 1, 3 }, new int[] { 2 });
	}

	private static void test(int[] nums1, int[] nums2)
	{
		Solution s = new Solution();
		System.out.println(s.findMedianSortedArrays(nums1, nums2));
	}
}

class Solution
{
	public double findMedianSortedArrays(int[] nums1, int[] nums2)
	{
		int len = nums1.length + nums2.length, mid = len / 2;
		if ((len & 1) == 0)
			return (getKth(nums1, 0, nums2, 0, mid) + getKth(nums1, 0, nums2, 0, mid + 1)) / 2;
		return getKth(nums1, 0, nums2, 0, mid + 1);
//		int[] nums = new int[len];
//		int idx1 = 0, idx2 = 0, idx = 0;
//		while (idx1 < m && idx2 < n)
//		{
//			if (nums1[idx1] < nums2[idx2])
//				nums[idx++] = nums1[idx1++];
//			else
//				nums[idx++] = nums2[idx2++];
//		}
//		while (idx1 < m)
//			nums[idx++] = nums1[idx1++];
//		while (idx2 < n)
//			nums[idx++] = nums2[idx2++];
//		int mid = len / 2;
//		return len % 2 == 0 ? 1.0 * (nums[mid - 1] + nums[mid]) / 2 : nums[mid];
	}

	private double getKth(int[] nums1, int start1, int[] nums2, int start2, int k)
	{
		int len1 = nums1.length - start1;
		int len2 = nums2.length - start2;
		if (len1 == 0)
			return nums2[start2 + k - 1];
		if (len2 == 0)
			return nums1[start1 + k - 1];
		if (k == 1)
			return Math.min(nums1[start1], nums2[start2]);
		int remove1 = Math.min(k / 2, len1);
		int remove2 = Math.min(k / 2, len2);
		if (nums1[start1 + remove1 - 1] < nums2[start2 + remove2 - 1])
			return getKth(nums1, start1 + remove1, nums2, start2, k - remove1);
		return getKth(nums1, start1, nums2, start2 + remove2, k - remove2);
	}
}