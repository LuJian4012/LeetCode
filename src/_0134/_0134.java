package _0134;

public class _0134
{
	public static void main(String[] args)
	{
		Solution s = new Solution();
		System.out.println(s.canCompleteCircuit(new int[] { 1, 2, 3, 4, 5 }, new int[] { 3, 4, 5, 1, 2 }));
		System.out.println(s.canCompleteCircuit(new int[] { 2, 3, 4 }, new int[] { 3, 4, 3 }));
		System.out.println(s.canCompleteCircuit(new int[] { 4, 3, 2, 1, 1 }, new int[] { 3, 3, 2, 2, 2 }));
	}
}

class Solution
{
	public int canCompleteCircuit(int[] gas, int[] cost)
	{
		int total = 0;
		int cur = 0;
		int begin = 0;
		for (int i = 0; i < gas.length; ++i)
		{
			total += gas[i] - cost[i];
			cur += gas[i] - cost[i];
			if (cur < 0)
			{
				begin = i + 1;
				cur = 0;
			}
		}
		return total >= 0 ? begin : -1;
	}
}