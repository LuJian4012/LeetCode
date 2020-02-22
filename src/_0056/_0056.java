package _0056;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;

public class _0056
{
	public static void main(String[] args)
	{
		test(new int[][] { { 1, 3 }, { 2, 6 }, { 8, 10 }, { 15, 18 } });
	}

	private static void test(int[][] nums)
	{
		Solution s = new Solution();
		int[][] newNums = s.merge(nums);
		for (int i = 0; i < newNums.length; i++)
			System.out.println("[" + newNums[i][0] + "," + newNums[i][1] + "]");
	}
}

class Solution
{
	public int[][] merge(int[][] intervals)
	{
		Arrays.sort(intervals, new Comparator<int[]>()
		{
			@Override
			public int compare(int[] o1, int[] o2)
			{
				if (o1[0] < o2[0])
					return -1;
				if (o1[0] > o2[0])
					return 1;
				return 0;
			}
		});
		ArrayList<int[]> res = new ArrayList<>();
		int idx = 0;
		while (idx < intervals.length)
		{
			int left = intervals[idx][0];
			int right = intervals[idx][1];
			while (idx < intervals.length - 1 && right >= intervals[idx + 1][0])
			{
				idx++;
				right = Math.max(right, intervals[idx][1]);
			}
			res.add(new int[] { left, right });
			idx++;
		}
		return res.toArray(new int[res.size()][]);
	}
}