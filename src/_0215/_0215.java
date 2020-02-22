package _0215;

import java.util.PriorityQueue;

public class _0215
{
	public static void main(String[] args)
	{

		test(new int[] { 3, 2, 1, 5, 6, 4 }, 2);
		test(new int[] { 3, 2, 3, 1, 2, 4, 5, 5, 6 }, 4);
	}

	private static void test(int[] nums, int k)
	{
		Solution s = new Solution();
		System.out.println(s.findKthLargest(nums, k));
	}
}

class Solution
{
	public int findKthLargest(int[] nums, int k)
	{
		PriorityQueue<Integer> heap = new PriorityQueue<>();
		for (int i = 0; i < k; i++)
			heap.offer(nums[i]);
		for (int i = k; i < nums.length; i++)
		{
			heap.offer(nums[i]);
			heap.poll();
		}
		return heap.poll();
	}
}