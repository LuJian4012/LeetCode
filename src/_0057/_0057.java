package _0057;

import java.util.LinkedList;

public class _0057
{
	public static void main(String[] args)
	{
		test(new int[][] { { 1, 3 }, { 6, 9 } }, new int[] { 2, 5 });
		test(new int[][] { { 1, 2 }, { 3, 5 }, { 6, 7 }, { 8, 10 }, { 12, 16 } }, new int[] { 4, 8 });
	}

	private static void test(int[][] intervals, int[] newInterval)
	{
		Solution s = new Solution();
		int[][] newNums = s.insert(intervals, newInterval);
		for (int i = 0; i < newNums.length; i++)
			System.out.print("[" + newNums[i][0] + "," + newNums[i][1] + "] ");
		System.out.println();
	}
}

class Solution
{
	public int[][] insert(int[][] intervals, int[] newInterval)
	{
		if (intervals == null || intervals.length == 0)
			return new int[][] { newInterval };
		LinkedList<int[]> list = new LinkedList<>();
		int i = 0;
		while (i < intervals.length && newInterval[0] > intervals[i][1])
			list.add(intervals[i++]);
		list.add(newInterval);
		while (i < intervals.length)
		{
			if (intervals[i][0] <= newInterval[1])
			{
				int[] temp = list.pollLast();
				temp[0] = Math.min(temp[0], intervals[i][0]);
				temp[1] = Math.max(temp[1], intervals[i][1]);
				list.add(temp);
			}
			else
				list.add(intervals[i]);
			i++;
		}
		return list.toArray(new int[list.size()][]);
	}
}