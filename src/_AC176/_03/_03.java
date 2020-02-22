package _AC176._03;

import java.util.Arrays;
import java.util.Comparator;

public class _03
{

	public static void main(String[] args)
	{
		test(new int[][] { { 1, 4 }, { 4, 4 }, { 2, 2, }, { 3, 4 }, { 1, 1 } });
		test(new int[][] { { 1, 2 }, { 2, 3 }, { 3, 4 } });
		test(new int[][] { { 1, 4 }, { 4, 4 }, { 2, 2 }, { 3, 4 }, { 1, 1 } });
		test(new int[][] { { 1, 2 }, { 1, 2 }, { 3, 3 }, { 1, 5 }, { 1, 5 } });
	}

	private static void test(int[][] events)
	{
		Solution s = new Solution();
		System.out.println(s.maxEvents(events));
	}
}

class Solution
{
	public int maxEvents(int[][] events)
	{
		if (events.length == 1)
			return 1;
		Arrays.sort(events, new Comparator<int[]>()
		{
			@Override
			public int compare(int[] o1, int[] o2)
			{
				return Integer.compare(o1[1] - o1[0], o2[1] - o2[0]);
			}
		});
		int max = Integer.MIN_VALUE;
		for (int i = 0; i < events.length; i++)
			max = Math.max(max, events[i][1]);
		int cnt = 0;
		boolean[] used = new boolean[max + 1];
		while (day <= events[events.length - 1][1] && cnt < events.length)
		{
			if (events[cnt][0] <= day)
				cnt++;
			day++;
		}
		return cnt;
	}
}